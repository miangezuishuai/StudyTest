package com.example.studytest.design_patterns.builder;


/**
 * 第四步，导演类，用来统一组装过程
 */
public class Direcror {
    Builder builder = null;

    public Direcror(Builder builder) {
        this.builder = builder;
    }

    public Phone CreatePhone(String cpu, String mainboard, String ram) {

        //规范建造流程
        builder.buildMainboard(mainboard);
        builder.buildCpu(cpu);
        builder.buildRam(ram);
        return builder.create();
    }
}
