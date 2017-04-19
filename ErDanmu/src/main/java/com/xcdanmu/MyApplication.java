package com.xcdanmu;

import android.app.Application;
import android.content.Context;

/**
 * Created by xiaochen on 2017/3/13.
 *
 * @email xiaochenu@gmail.com
 */

public class MyApplication extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
