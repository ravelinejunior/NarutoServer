package com.raveline

import com.raveline.data.model.ApiResponseModel
import com.raveline.data.repository.HeroRepository
import com.raveline.data.repository_impl.NEXT_PAGE_KEY
import com.raveline.data.repository_impl.PREVIOUS_PAGE_KEY
import com.raveline.plugins.configureRouting
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.testing.*
import io.ktor.util.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(InternalAPI::class)
@Suppress("DEPRECATION")
class ApplicationTest {

    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)


    @Test
    fun `access_root_endpoint, assert_correct_info`() {
        withTestApplication(moduleFunction = Application::module) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                assertEquals(
                    expected = "Naruto Api Motherfucker",
                    actual = response.content
                )
            }
        }
    }

    @Test
    fun `access_all_heroes_endpoint, assert_correct_information`() {
        withTestApplication(moduleFunction = Application::module) {
            handleRequest(HttpMethod.Get, "/naruto/heroes").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                val expected = ApiResponseModel(
                    success = true,
                    message = "ok",
                    prevPage = null,
                    nextPage = 2,
                    heroes = heroRepository.page1
                )

                val actualResult = Json.decodeFromString<ApiResponseModel>(response.content.toString())
                println("EXPECTED = $expected")
                println("ACTUAL = $actualResult")

                assertEquals(
                    expected = expected,
                    actual = actualResult
                )

            }
        }
    }

    @Test
    fun `access_search_endpoint, query_hero_name, assert_single_hero_result`() {
        withTestApplication(moduleFunction = Application::module) {
            handleRequest(HttpMethod.Get, "/naruto/heroes/search?heroName=ka").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                val actualHeroes = Json.decodeFromString<ApiResponseModel>(response.content.toString()).heroes
                println("Heroes founded $actualHeroes")
                assertEquals(
                    expected = 2,
                    actual = actualHeroes.size
                )
            }
        }
    }

    @Test
    fun `access_all_heroes_by_page_endpoint, assert_correct_information`() {
        withTestApplication(moduleFunction = Application::module) {
            val pages = 1..5
            val heroes = listOf(
                heroRepository.page1,
                heroRepository.page2,
                heroRepository.page3,
                heroRepository.page4,
                heroRepository.page5,
            )
            pages.forEach { page ->
                handleRequest(HttpMethod.Get, "/naruto/heroes?page=$page").apply {
                    println("Current page: $page")
                    assertEquals(
                        expected = HttpStatusCode.OK,
                        actual = response.status()
                    )
                    val expected = ApiResponseModel(
                        success = true,
                        message = "ok",
                        prevPage = calculatePage(page = page)["previousPage"],
                        nextPage = calculatePage(page = page)["nextPage"],
                        heroes = heroes[page - 1]
                    )
                    val actualResponse = Json.decodeFromString<ApiResponseModel>(response.content.toString())
                    assertEquals(
                        expected = expected,
                        actual = actualResponse
                    )
                }
            }

        }
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var nextPage: Int? = page
        var prevPage: Int? = page

        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        } else if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }

        if (page == 1) {
            prevPage = null
        }

        if (page == 5) {
            nextPage = null
        }

        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)

    }

}