package com.example.studytest.dagger2.abstract_inject;

import javax.inject.Inject;
import javax.inject.Named;

public class Car {

    private Engine engine;

    @Inject
    public Car(@Named("Diesel") Engine engine) {
        this.engine = engine;
    }

    public String run() {
        return engine.work();
    }
}
