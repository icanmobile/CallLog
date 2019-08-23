package com.icanmobile.calllogger.di

import com.icanmobile.calllogger.data.DataManager
import com.icanmobile.calllogger.data.calllog.CallLogManager
import com.icanmobile.calllogger.data.calllog.CallLogMapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class ApplicationModule {

    @Provides
    @Singleton
    fun provideDataManager(callLogManager: CallLogManager) = DataManager(callLogManager)

    @Provides
    @Singleton
    fun provideCallLogManager(callLogMapper: CallLogMapper) = CallLogManager(callLogMapper)
}