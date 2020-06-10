package com.example.studytest.dagger2;

import com.example.studytest.MainActivity;
import com.example.studytest.dagger2.abstract_inject.EngineModule;
import dagger.Component;


@Component(modules = EngineModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
