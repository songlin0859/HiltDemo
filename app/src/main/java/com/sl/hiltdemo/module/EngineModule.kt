package com.sl.hiltdemo.module

import com.sl.hiltdemo.data.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
interface EngineModule {

    @BindGasEngine
    @Binds
    fun bindGasEngine(gasEngine: GasEngine): Engine

    @BindElectricEngine
    @Binds
    fun bindElectricEngine(electricEngine: ElectricEngine): Engine

}