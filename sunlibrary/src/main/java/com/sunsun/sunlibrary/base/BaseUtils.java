package com.sunsun.sunlibrary.base;

import android.app.Activity;
import android.content.Context;

/**
 * 创建者 sunsun
 * 时间 16/7/6 上午1:27.
 * 个人公众号 ardays
 *
 * 功能 这里主要存储一些关于初始化
 *
 *
 */
public class BaseUtils {
    public static Activity mActivity;
    public static Context mContext;

    public static void init(Activity mActivity){
        BaseUtils.mActivity = mActivity;
        BaseUtils.mContext = mActivity;
    }
}
