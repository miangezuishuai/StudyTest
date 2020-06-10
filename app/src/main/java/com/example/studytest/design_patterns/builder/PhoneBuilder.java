package com.example.studytest.design_patterns.builder;


/**
 * 第三步，具体建造者，实现抽象Builder定义的所有方法，并返回一个建好的对象
 */
public class PhoneBuilder extends Builder {

    private Phone phone = new Phone();

    @Override
    public void buildCpu(String cpu) {
        phone.setmCpu(cpu);
    }

    @Override
    public void buildMainboard(String mainboard) {
        phone.setmMainboard(mainboard);
    }

    @Override
    public void buildRam(String ram) {
        phone.setmRam(ram);
    }

    @Override
    public Phone create() {
        return phone;
    }
}
