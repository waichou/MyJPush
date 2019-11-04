package com.test.myjpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @Author : ZhouWei
 * @TIME : 2019/10/29 12:06
 * @DESC :
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.setPowerSaveMode(this,true);
        JPushInterface.init(this);//


    }
}
