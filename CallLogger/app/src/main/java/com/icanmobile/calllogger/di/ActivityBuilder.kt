package com.icanmobile.calllogger.di

import com.icanmobile.calllogger.ui.calllogger.CallLoggerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindCallLoggerActivity(): CallLoggerActivity
}