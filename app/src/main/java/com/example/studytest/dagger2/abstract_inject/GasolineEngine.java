package com.example.studytest.dagger2.abstract_inject;

import com.example.studytest.dagger2.abstract_inject.Engine;

public class GasolineEngine extends Engine {
    @Override
    public String work() {
        return "汽油发动机发动";
    }
}
