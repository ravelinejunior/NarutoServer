package com.raveline.di

import com.raveline.data.repository.HeroRepository
import com.raveline.data.repository_impl.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}