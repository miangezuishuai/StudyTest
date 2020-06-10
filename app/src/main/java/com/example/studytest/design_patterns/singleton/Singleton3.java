package com.example.studytest.design_patterns.singleton;

/**
 * 懒汉模式（线程安全）
 * 这种写法能够在多线程中和很好地工作，但每次调用getInstance会造成不不必要的同步开销
 * 大部分时候用不到同步，所以不建议用这种模式
 */
public class Singleton3 {

    private static Singleton3 singleton3;

    private Singleton3() {

    }

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }

        return singleton3;
    }
}
