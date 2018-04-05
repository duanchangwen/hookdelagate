package com.dcw.hookdelagate;

import android.app.Application;

/**
 * Created by a on 18-4-4.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HookUtil hookUtil = new HookUtil();
        hookUtil.hookStartActivity(this);
        hookUtil.hookHookMh(this);
    }
}
