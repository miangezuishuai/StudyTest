package com.example.studytest.design_patterns.factory;

import android.util.Log;

public class LenovoComputer extends Computer {
    @Override
    public void start() {
        Log.d("Computer", "联想计算机启动");
    }
}
