package com.example.studytest.design_patterns.factory;

import android.util.Log;

public class HPComputer extends Computer {
    @Override
    public void start() {
        Log.d("Computer", "惠普计算机启动");
    }
}
