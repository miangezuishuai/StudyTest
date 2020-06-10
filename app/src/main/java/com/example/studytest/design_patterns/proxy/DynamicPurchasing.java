package com.example.studytest.design_patterns.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynamicPurchasing implements InvocationHandler {

    private Object object;

    public DynamicPurchasing(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(object, objects);
        if (method.getName().equals("buy")) {
            Log.d("代理模式", "棉哥在购买东西");
        }
        return result;
    }
}
