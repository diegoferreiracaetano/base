package com.diegoferreiracaetano.base.di.modules


import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

import com.diegoferreiracaetano.base.di.qualifier.ViewModelKey
import com.diegoferreiracaetano.base.ui.main.MainViewModel
import com.diegoferreiracaetano.base.MainViewModelFactory

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: MainViewModelFactory): ViewModelProvider.Factory
}