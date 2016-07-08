package com.sunsun.sunlibrary;

import com.sunsun.sunlibrary.base.BaseUtils;
import com.sunsun.sunlibrary.http.HttpUtils;
import com.sunsun.sunlibrary.http.RequestParams;
import com.sunsun.sunlibrary.utils.TextUtils;

import java.util.Date;

/**
 * 创建者 sunsun
 * 时间 16/7/6 下午3:02.
 * 个人公众号 ardays
 */
public class Test {
    public static void main(String[] strs){
        RequestParams params = HttpUtils.Recreation.getRecreation(1,1,"1998-01-02 22:12:23");
        System.out.println(params.getUrl());
    }
}
