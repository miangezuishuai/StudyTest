package com.example.studytest.design_patterns.builder;


/**
 * 第二步，创建Builder类，规范产品的组建
 */
public abstract class Builder {

    public abstract void buildCpu(String cpu);
    public abstract void buildMainboard(String mainboard);
    public abstract void buildRam(String ram);
    public abstract Phone create();
}
