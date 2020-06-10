package com.example.studytest.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Watch {

    @Inject
    public Watch() {
    }

    public void work() {
        Log.d("Dagger2", "手表在工作");
    }
}
