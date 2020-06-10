package com.example.studytest.design_patterns.builder;


/**
 * 第一步，创建产品类
 */
public class Phone {

    private String mCpu;
    private String mMainboard;
    private String mRam;

    public String getmCpu() {
        return mCpu;
    }

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public String getmMainboard() {
        return mMainboard;
    }

    public void setmMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }

    public String getmRam() {
        return mRam;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }
}
