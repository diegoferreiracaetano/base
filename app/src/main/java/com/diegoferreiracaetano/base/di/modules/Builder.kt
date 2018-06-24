package com.diegoferreiracaetano.base.di.modules


import com.diegoferreiracaetano.base.di.qualifier.ActivityScope
import com.diegoferreiracaetano.base.ui.MainActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Builder {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(FragmentBuildersModule::class))
    internal abstract fun contributeMainActivity(): MainActivity
}
