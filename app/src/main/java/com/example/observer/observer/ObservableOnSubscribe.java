package com.example.observer.observer;

/**
 * 用来绑定observable和发射器给用户发消息
 * 被观察者和发射器分离
 * @param <T>
 */
public interface ObservableOnSubscribe<T> {
    void subscribe(Emitter<T> emitter);
}
