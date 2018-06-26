package com.diegoferreiracaetano.base.di.components

import com.diegoferreiracaetano.base.MainApplication
import com.diegoferreiracaetano.base.di.modules.AppModule
import com.diegoferreiracaetano.base.di.modules.Builder

import javax.inject.Singleton

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(
        modules = [
            (AndroidSupportInjectionModule::class),
            (Builder::class),
            (AppModule::class)]
)
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApplication>()

}
