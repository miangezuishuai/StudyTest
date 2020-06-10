package com.example.studytest.design_patterns.builder;


/**
 * 客户端调用导演类
 *
 * 使用场景：相同的方法，不同的执行顺序产生不同的结果
 * 优点：客户端不必知道产品内部的细节，具体建造者之间相互独立，容易扩展
 * 缺点：产生多余的Builder和导演类
 */
public class BuilderClient {

    public void doWord() {
        Builder builder = new PhoneBuilder();
        Direcror direcror = new Direcror(builder);
        //组装手机
        direcror.CreatePhone("高通400", "垃圾主板", "三星DDR5");
    }
}
