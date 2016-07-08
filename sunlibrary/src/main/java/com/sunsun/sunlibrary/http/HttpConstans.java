package com.sunsun.sunlibrary.http;

/**
 * 创建者 sunsun
 * 时间 16/7/6 下午6:36.
 * 个人公众号 ardays
 *
 * 功能: 存储Http URl地址
 */
public class HttpConstans {
    /**
     * 每页加载多少条
     */
    public static final int PAGE_SIZE = 20;

    /**
     * 天气预报
     * 详情:https://www.juhe.cn/docs/api/id/73
     */
    public static final String WEATHER_FORECAST_URL = "http://op.juhe.cn/onebox/weather/query";


    /**
     * 按更新时间查看笑话
     * 详情:https://www.juhe.cn/docs/api/id/95
     */
    public static final String JOKE_LIST = "http://japi.juhe.cn/joke/content/list.from";

    /**
     * 最新笑话
     * 详情:https://www.juhe.cn/docs/api/id/95
     */
    public static final String JOKE_NEW = "http://japi.juhe.cn/joke/content/text.from";

    /**
     * 按更新时间查询趣图
     * 详情:https://www.juhe.cn/docs/api/id/95
     */
    public static final String JOKE_IMAGE_LIST = "http://japi.juhe.cn/joke/img/list.from";

    /**
     * 最新趣图
     * 详情:https://www.juhe.cn/docs/api/id/95
     */
    public static final String JOKE_IMAGE_NEW = "http://japi.juhe.cn/joke/img/text.from";

    /**
     * 随机获取趣图/笑话
     * 详情:https://www.juhe.cn/docs/api/id/95
     */
    public static final String JOKE_IMAGE_RANDOM = "http://japi.juhe.cn/joke/img/text.from";








}
