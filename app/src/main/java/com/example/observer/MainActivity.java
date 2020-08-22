package com.example.observer;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.observer.observer.Emitter;
import com.example.observer.observer.Observable;
import com.example.observer.observer.ObservableOnSubscribe;
import com.example.observer.observer.Observer;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(Emitter<String> emitter) {
                emitter.onNext("大家好");
            }
        }).subscribeObserver(new Observer<String>() {
            @Override
            public void onNext(String s) {
                Log.e(TAG, "onNext: "+s);
            }

            @Override
            public void onSubscribe() {
                Log.e(TAG, "onSubscribe: ");
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.e(TAG, "onComplete: ");
            }
        });
    }
}