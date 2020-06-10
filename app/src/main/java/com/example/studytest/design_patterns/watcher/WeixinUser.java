package com.example.studytest.design_patterns.watcher;

import android.util.Log;


/**
 * 具体观察者
 */
public class WeixinUser implements Observer {

    //微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        Log.d("观察者模式", message);
    }
}
