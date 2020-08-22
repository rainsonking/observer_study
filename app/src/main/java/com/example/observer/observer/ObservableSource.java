package com.example.observer.observer;


/**
 * 抽象类观察
 */
public interface ObservableSource {
    //订阅功能，用来绑定观察者与被观察者
    void subscribeObserver(Observer observer);
}
