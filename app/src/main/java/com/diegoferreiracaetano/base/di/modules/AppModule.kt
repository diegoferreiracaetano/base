package com.diegoferreiracaetano.base.di.modules

import android.content.Context

import com.diegoferreiracaetano.base.MainApplication

import javax.inject.Singleton

import dagger.Module
import dagger.Provides


@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: MainApplication): Context {
        return application.applicationContext
    }
}

