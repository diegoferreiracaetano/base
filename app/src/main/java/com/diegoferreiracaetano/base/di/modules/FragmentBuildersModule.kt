package com.diegoferreiracaetano.base.di.modules

import com.diegoferreiracaetano.base.di.qualifier.FragmentScope
import com.diegoferreiracaetano.base.ui.main.MainFragment

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @FragmentScope
    @ContributesAndroidInjector
    internal abstract fun contributeMainFragment(): MainFragment

}
