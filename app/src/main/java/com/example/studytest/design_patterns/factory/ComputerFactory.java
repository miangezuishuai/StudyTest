package com.example.studytest.design_patterns.factory;


/**
 * 第一步，创建抽象工厂
 */
public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
