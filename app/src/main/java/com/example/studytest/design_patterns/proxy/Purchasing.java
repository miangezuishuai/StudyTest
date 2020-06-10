package com.example.studytest.design_patterns.proxy;


/**
 * 代理类
 */
public class Purchasing implements IShop {

    private IShop iShop;

    public Purchasing(IShop iShop) {
        this.iShop = iShop;
    }

    @Override
    public void buy() {
        iShop.buy();
    }
}
