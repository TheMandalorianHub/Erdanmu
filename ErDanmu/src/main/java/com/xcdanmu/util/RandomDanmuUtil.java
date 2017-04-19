package com.xcdanmu.util;

import android.content.Context;
import android.util.TypedValue;

import com.xcdanmu.MyApplication;

import java.util.Random;

import master.flame.danmaku.danmaku.model.BaseDanmaku;

/**
 * Created by xiaochen on 2017/3/12.
 * 随机弹幕工具类
 *
 * @email xiaochenu@gmail.com
 */

public class RandomDanmuUtil {

    public static Random random = new Random();
    public static int[] DANMU_TYPE = {BaseDanmaku.TYPE_SCROLL_RL, BaseDanmaku.TYPE_FIX_BOTTOM, BaseDanmaku.TYPE_FIX_TOP
            ,BaseDanmaku.TYPE_SCROLL_LR};

    /**
     * 返回随机弹幕颜色
     */
    public static int getRandomColor() {
        int ranColor = 0xff000000 | random.nextInt(0x00ffffff);
        return ranColor;
    }

    /**
     * 返回随机弹幕类型
     */
    public static int getRandomType() {
        int len=DANMU_TYPE.length;
        return DANMU_TYPE[random.nextInt(len)];
    }
    /**返回随机弹幕的大小10~30*/
    public static int getRandomSize() {
        return dp2px(MyApplication.context,10f) + random.nextInt(dp2px(MyApplication.context,20f));
    }
    /**
     * dp转px
     */
    public static int dp2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }
}
