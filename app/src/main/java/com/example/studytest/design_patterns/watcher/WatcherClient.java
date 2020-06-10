package com.example.studytest.design_patterns.watcher;

public class WatcherClient {


    public void doWork() {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        WeixinUser weixinUser = new WeixinUser("罗志祥");

        subscriptionSubject.attach(weixinUser);

        subscriptionSubject.notify("多人运动");
    }



}
