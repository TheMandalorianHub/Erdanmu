package com.xcdanmu.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/**
 * Created by xiaochen on 2017/3/13.
 *
 * @email xiaochenu@gmail.com
 */

public class Debugma {
    public static boolean isApkDebugable(Context context) {
        try {
            ApplicationInfo info= context.getApplicationInfo();
            return (info.flags&ApplicationInfo.FLAG_DEBUGGABLE)!=0;
        } catch (Exception e) {

        }
        return false;
    }
}
