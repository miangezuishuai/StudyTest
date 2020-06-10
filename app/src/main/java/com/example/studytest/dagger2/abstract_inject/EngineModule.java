package com.example.studytest.dagger2.abstract_inject;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class EngineModule {

    @Provides
    @Named("Gssoline")
    public Engine provideGasoline() {
        return new GasolineEngine();
    }

    @Provides
    @Named("Diesel")
    public Engine provideDiesel() {
        return new DieselEngine();
    }
}
