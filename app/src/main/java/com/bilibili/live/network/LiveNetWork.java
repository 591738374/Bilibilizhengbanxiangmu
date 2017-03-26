package com.bilibili.live.network;

/**
 * Created by Neolee on 2017/3/22.
 * 直播界面网络路径
 */

public class LiveNetWork {

    //直播界面，不包括推荐主播
    public static String LIVE_URL1  = "http://live.bilibili.com/AppNewIndex/common?_device=android&appkey=1d8b6e7d45233436&build=501000&mobi_app=android&platform=android&scale=xxhdpi&ts=1490146483000&sign=2142dfd1649a840212a20b7b812380dd";
    //直播界面，推荐主播
    public static String LIVE_URL2  = "http://live.bilibili.com/AppNewIndex/recommend?_device=android&appkey=1d8b6e7d45233436&build=501000&mobi_app=android&platform=android&scale=xxhdpi&ts=1490146483000&sign=2142dfd1649a840212a20b7b812380dd";

    //番剧推荐
    public static String LIVE_URL3="http://bangumi.bilibili.com/api/app_index_page_v4?build=3940&device=phone&mobi_app=iphone&platform=ios";

    //评论
    public static String LIVE_URL4="http://api.bilibili.com/x/v2/reply?_device=android&access_key=3108e3e647e7f89085268be317e6873f&appkey=1d8b6e7d45233436&build=501000&mobi_app=android&oid=8675584&plat=2&platform=android&pn=1&ps=20&sort=0&type=1&sign=298ae6f954129bed1e1d1da47f84dc50";


}
