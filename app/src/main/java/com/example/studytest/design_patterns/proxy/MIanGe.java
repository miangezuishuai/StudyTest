package com.example.studytest.design_patterns.proxy;

import android.util.Log;


/**
 * 真是主题类
 */
public class MIanGe implements IShop {
    @Override
    public void buy() {
        Log.d("代理模式", "购买");
    }
}
