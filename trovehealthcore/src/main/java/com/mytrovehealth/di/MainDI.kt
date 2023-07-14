package com.mytrovehealth.di

import com.mytrovehealth.sources.TroveRepository
import org.koin.dsl.module


val repositoryModule = module {

    single {
        TroveRepository
    }



}

val viewModelModule = module {



}