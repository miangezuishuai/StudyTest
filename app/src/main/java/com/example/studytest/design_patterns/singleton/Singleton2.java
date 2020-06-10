package com.example.studytest.design_patterns.singleton;


/**
 * 懒汉模式（线程不安全）
 * 在用户第一次调用时初始化，虽然节约了资源，但是第一次加载需要实例化，反应稍慢了一些
 * 在多线程时不能正常工作
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
