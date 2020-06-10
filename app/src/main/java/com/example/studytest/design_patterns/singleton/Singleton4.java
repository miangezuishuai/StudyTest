package com.example.studytest.design_patterns.singleton;


/**
 * 双重检查模式（DCL）
 * 第一次判空是为了不必要的同步，第二次是在为null下创建实例
 * 用volatile多少会影响性能，但考虑程序正确性还是值得。
 * 优点：资源利用率高，第一次使用才实例化
 * 缺点：第一次加载时反应慢了一些，在高并发环境下也有一定缺陷
 * 建议用静态内部类单例模式
 */
public class Singleton4 {

    private volatile static Singleton4 singleton4;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
