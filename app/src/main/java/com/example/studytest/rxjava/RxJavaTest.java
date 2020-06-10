package com.example.studytest.rxjava;

import android.util.Log;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

import java.util.concurrent.TimeUnit;

public class RxJavaTest {

    private static RxJavaTest rxJavaTest;

    private RxJavaTest() {

    }

    public static RxJavaTest getInstance() {
        if (rxJavaTest == null) {
            rxJavaTest = new RxJavaTest();
        }
        return rxJavaTest;
    }


    /****单例模式到此结束，以下是正文***/

    //创建操作符
    public void interval() {
        Observable.interval(3,TimeUnit.SECONDS).subscribe(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) throws Exception {
                Log.d("RxJava", "intercal操作符" + aLong);
            }
        });
    }


    //变换操作符
    public void map() {
        final String Host = "棉哥最帅";
        Observable.just("1", "2", "3").map(new Function<String, String>() {
            @Override
            public String apply(String s) throws Exception {
                return Host + s;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.d("RxJava", "map操作符" + s);
            }
        });
    }

    public void flatMap_cast() {
        final String Host = "棉哥最帅";
        Observable.just("1", "2", "3").flatMap(new Function<String, ObservableSource<?>>() {
            @Override
            public ObservableSource<?> apply(String s) throws Exception {
                return Observable.just(Host+s);
            }
        }).cast(String.class).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                Log.d("RxJava", "flatMap操作符" + s);
            }
        });
    }


}
