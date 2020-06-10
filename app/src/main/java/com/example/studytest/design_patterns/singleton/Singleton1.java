package com.example.studytest.design_patterns.singleton;


/**
 * 饿汉模式
 * 在类加载时完成了初始化，所以类加载慢，但获取对象快，避免了多线程的同步问题，
 * 如果从没使用过这个实例，则造成内存浪费
 */
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance() {
        return singleton1;
    }

}
