package com.dji.importsdkdemo;

import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;

public class MApplication extends Application {

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this); //
        // do this because sdk classes need to loaded before loading process is done
    }

}