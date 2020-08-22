package com.example.observer.observer;

public abstract class Observable implements ObservableSource{
    @Override
    public void subscribeObserver(Observer observer) {
        //在这里把订阅逻辑交给各种不同的Observable处理，比如背压等
        subscribeActual(observer);

    }
    //模板方法
    protected abstract void subscribeActual(Observer observer);

    //创建具体被观察者
    public static <T> Observable create(ObservableOnSubscribe<T> source){
        return new ObservableCreate<>(source);
    }
}
