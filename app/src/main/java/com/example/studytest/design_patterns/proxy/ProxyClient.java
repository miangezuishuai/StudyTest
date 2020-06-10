package com.example.studytest.design_patterns.proxy;

import java.lang.reflect.Proxy;

public class ProxyClient {


    //静态代理模式
    public void doWork() {
        IShop miange = new MIanGe();
        IShop purchasing = new Purchasing(miange);
        purchasing.buy();
    }

    //动态代理模式
    public void doWork2() {
        IShop miange = new MIanGe();
        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(miange);
        ClassLoader loader = miange.getClass().getClassLoader();

        //动态创建代理类
        IShop purchasing = (IShop) Proxy.newProxyInstance(loader, new Class[]{IShop.class}, dynamicPurchasing);
        purchasing.buy();
    }
}
