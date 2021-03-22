package com.sl.hiltdemo.module

import com.sl.hiltdemo.data.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
interface EngineModule {

    @BindGasEngine
    //@Singleton
    @ActivityScoped
    @Binds
    fun bindGasEngine(gasEngine: GasEngine): Engine

    @BindElectricEngine
    @Binds
    fun bindElectricEngine(electricEngine: ElectricEngine): Engine

}