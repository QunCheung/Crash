package com.bdyx.crash;

import android.app.Application;

import com.bdyx.crash.crash.CrashHandler;

/**
 * Created by QunCheung on 2017/1/22.
 */

public class app extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(getApplicationContext());
    }
}
