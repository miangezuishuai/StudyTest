package com.example.studytest.design_patterns.factory;


/**
 * g工厂方法模式
 */
public class FactoryClient {

    public void doWork() {
        ComputerFactory computerFactory = new GDComputerFactory();

        LenovoComputer lenovoComputer = computerFactory.createComputer(LenovoComputer.class);
        lenovoComputer.start();

        HPComputer hpComputer = computerFactory.createComputer(HPComputer.class);
        hpComputer.start();
    }
}
