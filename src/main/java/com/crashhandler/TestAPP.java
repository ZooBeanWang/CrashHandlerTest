package com.crashhandler;

import android.app.Application;

/**
 * Created by admin on 2016/5/24.
 */
public class TestAPP extends Application {
    private static TestAPP sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        //设置当前进程crash信息的处理方式
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }

    public static TestAPP getsInstance() {
        return sInstance;
    }
}
