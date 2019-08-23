package com.icanmobile.calllogger.di

import androidx.lifecycle.ViewModelProvider
import com.icanmobile.calllogger.ui.calllogger.CallLoggerActivityViewModelFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ViewModelModule {

    @Provides
    @Singleton
    fun provideCallLoggerActivityViewModel(factory: CallLoggerActivityViewModelFactory): ViewModelProvider.Factory = factory

}