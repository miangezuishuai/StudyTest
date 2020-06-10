package com.example.studytest.dagger2;


import com.example.studytest.SecondActivity;
import dagger.Component;

@Component(modules = GsonModule.class)
public interface SecondActivityComponent {
    void inject(SecondActivity secondActivity);
}
