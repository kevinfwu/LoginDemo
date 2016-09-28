package com.example.kavinf.logindemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by kavinf on 2016/9/27.
 */
public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
