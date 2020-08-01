package com.example.x5sample;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.tencent.smtt.sdk.QbSdk;

public class AppApplication extends Application {
    private static final String TAG = "APP_APPLICATION";
    @Override
    public void onCreate() {
        super.onCreate();
        initX5SDK();
    }
    private void initX5SDK() {
        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {

            }

            @Override
            public void onViewInitFinished(boolean b) {
                Log.d(TAG, "onViewInitFinished: ");
                Toast.makeText(getBaseContext(), "x5初始化成功? " + b, Toast.LENGTH_LONG).show();
            }
        };

        QbSdk.initX5Environment(getApplicationContext(), cb);

    }
}
