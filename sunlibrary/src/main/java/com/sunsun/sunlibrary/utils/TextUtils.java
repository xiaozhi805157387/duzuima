package com.sunsun.sunlibrary.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建者 sunsun
 * 时间 16/7/6 下午2:52.
 * 个人公众号 ardays
 *
 * 字符转码
 */
public class TextUtils {

    /**
     * UTF-8转码
     */
    public static String enCodeUTF_8(String str){
        try {
            return URLEncoder.encode(str,"UTF-8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "转码错误,请重新输入";
    }


    /**
     * 转换为时间戳
     *
     * @param time 时间格式 要yyyy-MM-dd hh:MM:ss
     * @return
     */
    public static String toTimeStamp(String time){
        //创建时间字符串
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date;
        //判断是否为空
        try {
            date = format.parse(time);
            return date.getTime() / 1000 + "";
        } catch (ParseException e) {
            e.printStackTrace();
            return toTimeStamp();
        }
    }

    /**
     * 获取当时间的时间戳
     */
    public static String toTimeStamp(){
        //创建时间字符串
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return format.parse(format.format(new Date())).getTime() / 1000L + "";
        } catch (ParseException e) {
            e.printStackTrace();
            return "时间格式错误";
        }
    }




}
