package com.sunsun.sunlibrary.http;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建者 sunsun
 * 时间 16/7/6 下午6:40.
 * 个人公众号 ardays
 */
public class RequestParams {

    private Map<String,Object> mParams;

    public RequestParams(){
        mParams = new HashMap<>();
    }


    /**
     * 这里是地址开头
     */
    private String mPath;

    /**
     * 完整地址带参数
     */
    private String mUrl;


    /**
     * 替换地址
     *
     * @param path 地址
     */
    public void setPath(String path) {
        this.mPath = path;
    }


    /**
     * 写入参数
     * @param k 参数
     * @param v 值
     */
    public void put(String k,Object v){
        mParams.put(k , v);
    }


    /**
     * @return  返回url地址带参数
     */
    public String getUrl(){
        mUrl =  mPath + "?";

        /**
         * 拼接参数
         */
        for(String str : mParams.keySet()){
            //Http://xxxxx ? key = value &
            mUrl += str + "=" + mParams.get(str) + "&";
        }

        //截取最后一位
        mUrl = mUrl.substring(0,mUrl.length() - 1);

        return mUrl;
    }
}
