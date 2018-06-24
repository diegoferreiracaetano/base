package com.diegoferreiracaetano.base

import android.support.v7.app.AppCompatDelegate

import com.diegoferreiracaetano.base.di.components.DaggerAppComponent

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<MainApplication> {

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        return DaggerAppComponent.builder().create(this)
    }
}