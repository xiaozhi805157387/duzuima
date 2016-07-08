package com.sunsun.sunlibrary.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import com.sunsun.sunlibrary.base.BaseUtils;

/**
 * 创建者 sunsun
 * 时间 16/7/3 下午11:35.
 * 个人公众号 ardays
 *
 * Intent打开本地App界面
 */
public class IntentUtils {

    /**
     * QQ聊天
     * @param qq_account QQ账号
     */
    public static void chatQQ(String qq_account){
        String qq = "mqqwpa://im/chat?chat_type=wpa&uin=" + qq_account;
        parse(qq);
    }


    /**
     * 显示地图
     * @param lat   经度
     * @param lng   纬度
     */
    public static void geoAddress(String lat,String lng){
        String geo = "geo:" + lat + "," + lng;
        parse(geo);
    }

    /**
     * 浏览网页
     * @param url  网页连接
     */
    public static void browseWeb(String url){
        parse(url);
    }

    /**
     * 拨打电话
     * @param tel   电话号码
     *
     */
    public static void call(String tel){
        tel = "tel:" + tel;
        parse(tel);
    }

    /**
     * 打开联系人
     */
    public static void openContacts(){
        String constacts = "content://contacts/people";
        parse(constacts);
    }


    /**
     * 从图库获取图片
     */
    public static void openGallery(Activity mActivity){
        Intent i = new Intent();

        i.setType("image/*");

        i.setAction(Intent.ACTION_GET_CONTENT);

        mActivity.startActivityForResult(i, 11);
    }


    /**
     * 卸载APP
     * @param packageName  包名
     */
    public static void uninstallAPK(String packageName){
        Uri uri = Uri.fromParts("package",packageName,null);
        uri(Intent.ACTION_DELETE,uri);
    }





    /**
     *  打开系统 or 第三方的接口
     * @param uri Uri.parse值
     */
    private static void parse(String uri){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        BaseUtils.mContext.startActivity(intent);
    }


    /**
     *  打开系统 or 第三方的接口
     * @param uri Uri.parse值
     */
    private static void uri(String name,Uri uri){

        String action;
        if(TextUtils.isEmpty(name)){
            action = Intent.ACTION_VIEW;
        }else{
            action = name;
        }

        Intent intent = new Intent(action,uri);
        BaseUtils.mContext.startActivity(intent);
    }
}
