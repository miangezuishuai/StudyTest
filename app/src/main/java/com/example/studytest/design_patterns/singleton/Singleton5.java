package com.example.studytest.design_patterns.singleton;


/**
 * 静态内部类单例模式
 * 加载Singleton5类不会初始化，只有第一次调用getInstance才会初始化，
 * 不仅保证线程安全，还保证唯一性，推荐使用
 */
public class Singleton5 {
    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        return Singleton5Holder.SINGLETON_5;
    }

    private static class Singleton5Holder {
        private static final Singleton5 SINGLETON_5 = new Singleton5();
    }
}
