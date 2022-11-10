package com.raveline.data.repository_impl

import com.raveline.data.model.ApiResponseModel
import com.raveline.data.model.HeroModel
import com.raveline.data.repository.HeroRepository

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class HeroRepositoryImpl : HeroRepository {
    override val heroes: Map<Int, List<HeroModel>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        HeroModel(
            id = 1,
            heroName = "Sasuke",
            heroImage = "/images/sasuke.jpg",
            heroAbout = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            heroRating = 5.0,
            heroPower = 98,
            month = "July",
            day = "23rd",
            heroFamily = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            heroAbilities = listOf(
                "Sharingan",
                "Rinnegan",
                "Sussano",
                "Amateratsu",
                "Intelligence"
            ),
            heroNatureTypes = listOf(
                "Lightning",
                "Fire",
                "Wind",
                "Earth",
                "Water"
            )
        ),
        HeroModel(
            id = 2,
            heroName = "Naruto",
            heroImage = "/images/naruto.jpg",
            heroAbout = "Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) is a shinobi of Konohagakure's Uzumaki clan. He became the jinchūriki of the Nine-Tails on the day of his birth — a fate that caused him to be shunned by most of Konoha throughout his childhood. After joining Team Kakashi, Naruto worked hard to gain the village's acknowledgement all the while chasing his dream to become Hokage.",
            heroRating = 5.0,
            heroPower = 98,
            month = "Oct",
            day = "10th",
            heroFamily = listOf(
                "Minato",
                "Kushina",
                "Boruto",
                "Himawari",
                "Hinata"
            ),
            heroAbilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Shadow Clone",
                "Senin Mode"
            ),
            heroNatureTypes = listOf(
                "Wind",
                "Earth",
                "Lava",
                "Fire"
            )
        ),
        HeroModel(
            id = 3,
            heroName = "Sakura",
            heroImage = "/images/sakura.jpg",
            heroAbout = "Sakura Uchiha (うちはサクラ, Uchiha Sakura, née Haruno (春野)) is a kunoichi of Konohagakure. When assigned to Team 7, Sakura quickly finds herself ill-prepared for the duties of a shinobi. However, after training under the Sannin Tsunade, she overcomes this, and becomes recognised as one of the greatest medical-nin in the world.",
            heroRating = 4.5,
            heroPower = 92,
            month = "Mar",
            day = "28th",
            heroFamily = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke"
            ),
            heroAbilities = listOf(
                "Chakra Control",
                "Medical Ninjutsu",
                "Strength",
                "Intelligence"
            ),
            heroNatureTypes = listOf(
                "Earth",
                "Water",
                "Fire"
            )
        )
    )
    override val page2 = listOf(
        HeroModel(
            id = 4,
            heroName = "Boruto",
            heroImage = "/images/boruto.png",
            heroAbout = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties.",
            heroRating = 4.9,
            heroPower = 95,
            month = "Mar",
            day = "27th",
            heroFamily = listOf(
                "Naruto",
                "Hinata",
                "Hanabi",
                "Himawari",
                "Kawaki"
            ),
            heroAbilities = listOf(
                "Karma",
                "Jogan",
                "Rasengan",
                "Intelligence"
            ),
            heroNatureTypes = listOf(
                "Lightning",
                "Wind",
                "Water"
            )
        ),
        HeroModel(
            id = 5,
            heroName = "Sarada",
            heroImage = "/images/sarada.jpg",
            heroAbout = "Sarada Uchiha (うちはサラダ, Uchiha Sarada) is a kunoichi from Konohagakure's Uchiha clan. Because she was raised only by her mother without having her father around, Sarada initially struggles to understand who she is or what she's supposed to be. After meeting him with the help of Naruto Uzumaki, Sarada comes to believe that she is defined by the connections she has with others, and as a member of Team Konohamaru, she seeks to someday become Hokage so that she can connect with as many people as possible.",
            heroRating = 4.9,
            heroPower = 95,
            month = "Mar",
            day = "31st",
            heroFamily = listOf(
                "Sasuke Uchiha",
                "Sakura Uchiha"
            ),
            heroAbilities = listOf(
                "Sharingan",
                "Strength",
                "Intelligence"
            ),
            heroNatureTypes = listOf(
                "Lightning",
                "Wind",
                "Fire"
            )
        ),
        HeroModel(
            id = 6,
            heroName = "Mitsuki",
            heroImage = "/images/mitsuki.jpg",
            heroAbout = "Mitsuki (ミツキ, Mitsuki) is a synthetic human that was created as a partial clone of Orochimaru. Immigrating to Konohagakure to confirm whether or not Boruto Uzumaki was his \"sun\", he became a shinobi and was placed on Team Konohamaru. Mitsuki was created as a clone of Orochimaru, being cultivated from the same embryo as at least one older \"Mitsuki\", and raised in a test tube.",
            heroRating = 4.9,
            heroPower = 95,
            month = "Jul",
            day = "25th",
            heroFamily = listOf(
                "Orochimaru",
                "Log"
            ),
            heroAbilities = listOf(
                "Senin Mode",
                "Transformation",
                "Intelligence"
            ),
            heroNatureTypes = listOf(
                "Lightning",
                "Wind"
            )
        )
    )
    override val page3 = listOf(
        HeroModel(
            id = 7,
            heroName = "Kawaki",
            heroImage = "/images/kawaki.jpg",
            heroAbout = "Kawaki (カワキ, Kawaki) is a child raised by Kara to be the future vessel for Isshiki Ōtsutsuki and the key to the fulfilment of their greatest wish.[1] After being brought to Konohagakure by Team 7, he is taken in by Naruto Uzumaki who raises him as his own, during which he develops a brotherly bond with Boruto Uzumaki to solve the mystery of the Kāma.",
            heroRating = 4.2,
            heroPower = 92,
            month = "Jan",
            day = "1st",
            heroFamily = listOf(
                "Kokatsu"
            ),
            heroAbilities = listOf(
                "Karma",
                "Transformation",
                "Strength"
            ),
            heroNatureTypes = listOf(
                "Fire"
            )
        ),
        HeroModel(
            id = 8,
            heroName = "Orochimaru",
            heroImage = "/images/orochimaru.jpg",
            heroAbout = "Orochimaru (大蛇丸, Orochimaru) is one of Konohagakure's legendary Sannin. With a life-ambition to learn all of the world's secrets, Orochimaru seeks immortality so that he might live all of the lives necessary to accomplish his task. After being caught red-handed performing unethical experiments on his fellow citizens for the sake of this immortality, Orochimaru defected from Konoha.",
            heroRating = 4.5,
            heroPower = 97,
            month = "Oct",
            day = "27th",
            heroFamily = listOf(
                "Mitsuki",
                "Log"
            ),
            heroAbilities = listOf(
                "Senin Mode",
                "Transformation",
                "Science"
            ),
            heroNatureTypes = listOf(
                "Lightning",
                "Wind",
                "Fire",
                "Earth",
                "Water"
            )
        ),
        HeroModel(
            id = 9,
            heroName = "Kakashi",
            heroImage = "/images/kakashi.png",
            heroAbout = "Kakashi Hatake (はたけカカシ, Hatake Kakashi) is a shinobi of Konohagakure's Hatake clan. Famed as Kakashi of the Sharingan (写輪眼のカカシ, Sharingan no Kakashi), he is one of Konoha's most talented ninja, regularly looked to for advice and leadership despite his personal dislike of responsibility. To his students on Team 7, Kakashi emphasises the importance of teamwork; he himself received this lesson, along with the Sharingan, from his childhood friend, Obito Uchiha.",
            heroRating = 4.5,
            heroPower = 96,
            month = "Sep",
            day = "15th",
            heroFamily = listOf(
                "Sakumo"
            ),
            heroAbilities = listOf(
                "Intelligence",
                "Strength"
            ),
            heroNatureTypes = listOf(
                "Lightning",
                "Wind",
                "Fire",
                "Earth",
                "Water"
            )
        )
    )
    override val page4 = listOf(
        HeroModel(
            id = 10,
            heroName = "Isshiki",
            heroImage = "/images/ishiki.jpg",
            heroAbout = "A thousand years ago, Isshiki came to Earth alongside Kaguya with the objective to plant a Tree to harvest its Chakra Fruit. While Kaguya, being lower-ranked, was planned to be sacrificed to create the Chakra Fruit, she instead turned on Isshiki, leaving him on the verge of death after destroying Isshiki's lower half. Encountering Jigen and not having the strength to implant a Kāma on him, Isshiki devised a desperate plan and shrunk himself to enter the monk's ear in order to survive his injury by absorbing Jigen's nutrients.",
            heroRating = 5.0,
            heroPower = 100,
            month = "Jan",
            day = "1st",
            heroFamily = listOf(
                "Otsutsuki Clan"
            ),
            heroAbilities = listOf(
                "Sukunahikona",
                "Daikokuten",
                "Byakugan",
                "Space–Time",
                "Intelligence"
            ),
            heroNatureTypes = listOf(
                "Fire"
            )
        ),
        HeroModel(
            id = 11,
            heroName = "Momoshiki",
            heroImage = "/images/momoshiki.jpg",
            heroAbout = "Momoshiki Ōtsutsuki (大筒木モモシキ, Ōtsutsuki Momoshiki) was a member of the Ōtsutsuki clan's main heroFamily, sent to investigate the whereabouts of Kaguya and her God Tree and then attempting to cultivate a new one out of the chakra of the Seventh Hokage. In the process of being killed by Boruto Uzumaki, Momoshiki placed a Kāma on him, allowing his spirit to remain intact through the mark.",
            heroRating = 3.9,
            heroPower = 98,
            month = "Jan",
            day = "1st",
            heroFamily = listOf(
                "Otsutsuki Clan"
            ),
            heroAbilities = listOf(
                "Rinnegan",
                "Byakugan",
                "Strength"
            ),
            heroNatureTypes = listOf(
                "Fire",
                "Lightning",
                "Wind",
                "Water",
                "Earth"
            )
        ),
        HeroModel(
            id = 12,
            heroName = "Urashiki",
            heroImage = "/images/urashiki.jpg",
            heroAbout = "Urashiki Ōtsutsuki (大筒木ウラシキ, Ōtsutsuki Urashiki) was a low-ranking member of the Ōtsutsuki clan's main heroFamily, sent to assist Momoshiki and Kinshiki on their mission to investigate Kaguya's whereabouts and gather the chakra of the God Tree on Earth. Compared to his comrades, Urashiki had been shown to have a rather laid-back and jovial personality. He was quite willing to joke along with Momoshiki and Kinshiki, and disparaged on how serious they are.",
            heroRating = 3.4,
            heroPower = 95,
            month = "Jan",
            day = "1st",
            heroFamily = listOf(
                "Otsutsuki Clan"
            ),
            heroAbilities = listOf(
                "Space–Time",
                "Rinnegan",
                "Byakugan"
            ),
            heroNatureTypes = listOf(
                "Fire",
                "Lightning",
                "Wind",
                "Earth"
            )
        )
    )
    override val page5 = listOf(
        HeroModel(
            id = 13,
            heroName = "Code",
            heroImage = "/images/code.jpg",
            heroAbout = "Code (コード, Kōdo) is the last active Inner from Kara. Carrying Isshiki Ōtsutsuki's legacy within him, he inherits the Ōtsutsuki Clan's will to become a Celestial Being and continually evolve. At the time Kawaki was brought to Kara, Code was one of fifteen candidates in Jigen and Amado's Ōtsutsuki ritual to screen for a Kāma vessel for Isshiki. Only Kawaki survived to become an actual vessel.",
            heroRating = 4.8,
            heroPower = 99,
            month = "Jan",
            day = "1st",
            heroFamily = listOf(
                "Unknown"
            ),
            heroAbilities = listOf(
                "White Karma",
                "Transformation",
                "Genjutsu"
            ),
            heroNatureTypes = listOf(
                "Unknown"
            )
        ),
        HeroModel(
            id = 14,
            heroName = "Amado",
            heroImage = "/images/amado.jpg",
            heroAbout = "Amado (アマド, Amado) is a former Inner from the organisation Kara and the head of its research and development division. He has since defected to Konohagakure, where he used a mix of bluffs and gifts to gain official citizenship for the Hokage's protection. Amado had a daughter who died twelve years prior to the reign of the Seventh Hokage. In his quest to kill Isshiki Ōtsutsuki, Amado joined Kara and was granted the rank of Inner, serving as the head of its research and development division.",
            heroRating = 5.0,
            heroPower = 90,
            month = "Jan",
            day = "1st",
            heroFamily = listOf(
                "Unknown"
            ),
            heroAbilities = listOf(
                "Science",
                "Intelligence",
                "Trickery"
            ),
            heroNatureTypes = listOf(
                "Unknown"
            )
        ),
        HeroModel(
            id = 15,
            heroName = "Koji",
            heroImage = "/images/koji.jpg",
            heroAbout = "Koji Kashin (果心居士, Kashin Koji) is a clone of Jiraiya that was created by Amado for the purpose of killing Isshiki Ōtsutsuki. A former Inner of Kara, he was in charge of the sector on the outskirts of the Land of Fire. An enigmatic man, Koji has a very stoic and straightforward nature that follows a no-nonsense view. Arrogant as he may appear, he has consistently shown himself to be a very rational and perceptive man.",
            heroRating = 4.5,
            heroPower = 90,
            month = "Jan",
            day = "1st",
            heroFamily = listOf(
                "Jiraiya"
            ),
            heroAbilities = listOf(
                "Senin Mode",
                "Rasengan",
                "Shadow Clone"
            ),
            heroNatureTypes = listOf(
                "Fire",
                "Earth"
            )
        )
    )

    private fun calculatePage(page: Int): Map<String, Int?> {
        var nextPage: Int? = page
        var prevPage: Int? = page

        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }

        if (page in 2..5) {
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

    override suspend fun getAllHeroes(page: Int): ApiResponseModel =
        ApiResponseModel(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )

    override suspend fun searchHeroes(heroName: String?): ApiResponseModel {
        return ApiResponseModel(
            success = true,
            message = "ok",
            heroes = findHeroes(heroName)
        )
    }

    private fun findHeroes(name: String?): List<HeroModel> {
        val heroesFound = mutableListOf<HeroModel>()
        return if (!name.isNullOrEmpty()) {
            heroes.forEach { (_, _heroes) ->
                _heroes.forEach { hero ->
                    if (hero.heroName.lowercase().contains(name.lowercase())) {
                        heroesFound.add(hero)
                    }
                }
            }
            heroesFound
        } else {
            return emptyList()
        }
    }
}



