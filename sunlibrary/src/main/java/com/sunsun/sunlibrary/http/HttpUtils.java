package com.sunsun.sunlibrary.http;

import com.sunsun.sunlibrary.api.KeyStorage;
import com.sunsun.sunlibrary.utils.TextUtils;

/**
 * 创建者 sunsun
 * 时间 16/7/6 上午1:31.
 * 个人公众号 ardays
 *
 * 功能  一些公有的第三方接口
 */
public class HttpUtils {

    /**
     * 这里是QQ接口
     */
    public static class QQ{

        /**
         * 获取QQ秀
         * @param qq 账号
         * @return 返回QQ秀图片地址
         */
        public static String getQQShowUrl(String qq){
            return "http://qqshow-user.tencent.com/" + qq + "/22/00/1.gif?fr=mobileqq";
        }


        /**
         * 获取QQ头像
         * @param qq 账号
         * @return 返回QQ头像地址
         */
        public static String getHeadImageUrl(String qq){
            return "http://q2.qlogo.cn/headimg_dl?bs=qq&dst_uin=" + qq + "&spec=100";
        }


    }

    /**
     * 生活服务类
     */
    public static class LifeService{

        /**
         * 获取天气预报
         * @param city  城市名  深圳,河源等等
         * @return 天气预报连接
         */
        public static RequestParams getWeather(String city){
            RequestParams params = new RequestParams();
            //写入地址
            params.setPath(HttpConstans.WEATHER_FORECAST_URL);
            //写入城市名字参数
            params.put("cityname", TextUtils.enCodeUTF_8(city));
            //写入密钥
            params.put("key", KeyStorage.WEATHER_FORECAST_KEY);
            //返回数据的格式,xml或json，默认json
            params.put("dtype","json");

            return params;
        }


    }


    /**
     * 娱乐类
     */
    public static class Recreation{

        /**
         * 获取笑话
         * @param type 分类
         *      1.按更新时间查看笑话
         *      2.最新笑话
         *      3.按更新时间查看趣图
         *      4.最新趣图
         *      5.随机获取趣图/笑话
         *
         *             ty
         *
         * @param page 分页
         * @param time 时间
         */
        public static RequestParams getRecreation(int type,int page,String time){
            RequestParams params = new RequestParams();
            /**
             * 根据分类来选择
             */
            switch (type){
                case 1:
                    params.setPath(HttpConstans.JOKE_LIST);
                    params.put("time",TextUtils.toTimeStamp(time));
                    break;
                case 2:
                    params.setPath(HttpConstans.JOKE_NEW);
                    break;
                case 3:
                    params.setPath(HttpConstans.JOKE_IMAGE_LIST);
                    params.put("time",TextUtils.toTimeStamp(time));
                    break;
                case 4:
                    params.setPath(HttpConstans.JOKE_IMAGE_NEW);
                    break;
                case 5:
                    params.setPath(HttpConstans.JOKE_IMAGE_RANDOM);
                    break;
                default:
                    break;
            }
            /**
             * 写入API key
             */
            params.put("key",KeyStorage.JOKE_KEY);
            /**
             * 写入当前页数
             */
            params.put("page",page);
            /**
             * 每次加载多少条
             */
            params.put("pagesize",HttpConstans.PAGE_SIZE);
            return params;
        }
    }





}
