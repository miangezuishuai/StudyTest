package com.example.studytest.design_patterns.factory;

public class GDComputerFactory extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {

        Computer computer = null;
        String className = clz.getName();

        try {
            //通过反射来生产不同厂家的计算机
            computer = (Computer) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
