package com.example.observer.observer;

/**
 * 给用户发消息
 * @param <T>
 */
public interface Emitter<T> {

    void onNext(T t);
    void onError(Throwable e);
    void onComplete();
}
