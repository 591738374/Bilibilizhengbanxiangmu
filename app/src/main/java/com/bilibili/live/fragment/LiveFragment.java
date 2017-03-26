package com.bilibili.live.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.fastjson.JSON;
import com.bilibili.R;
import com.bilibili.fragment.BaseFragment;
import com.bilibili.live.adapter.LiveAdapter;
import com.bilibili.live.bean.LiveBean;
import com.bilibili.live.bean.RecomendBean;
import com.bilibili.live.network.LiveNetWork;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * Created by Neolee on 2017/3/21.
 * 直播fragment
 */

public class LiveFragment extends BaseFragment {


    @BindView(R.id.rv_home)
    RecyclerView rvHome;


    private LiveBean.DataBean data;
    private LiveAdapter adapter;
    private RecomendBean.DataBean data2;
    private String url1;
    private String url2;
    private Map map;




    /**
     * 刷新的内容
     *
     * @return
     */

//    private ListView listView;


    private ArrayList<HashMap<String, String>> list;

    private View header;
//    @BindView(R.id.refresh)
//    com.cjj.MaterialRefreshLayout refreshLayout;

    @BindView(R.id.srl)
    SwipeRefreshLayout swiperefresh;


    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_live, null);
        ButterKnife.bind(this, view);

        //监听下拉和上拉刷新
//        refreshLayout.setMaterialRefreshListener(new MyMaterialRefreshListener());


        return view;
    }


    @Override
    public void initData() {
        super.initData();
        getDataFromNet();

        //下拉刷新
        refresh();

    }

    private void refresh() {
        //设置滑动距离
        swiperefresh.setDistanceToTriggerSync(100);

        //设置颜色
        swiperefresh.setColorSchemeColors(Color.RED);

        //下拉刷新
        swiperefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //刷新重新请求数据
                        getDataFromNet();

                    }
                },500);

            }
        });

    }

    private void getDataFromNet() {
        //直播界面网址，不要包括推荐主播
        url1 = LiveNetWork.LIVE_URL1;

        OkHttpUtils.get()
                .url(url1)
                .build()

                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "Home页面联网失败" + e.getMessage());

                        swiperefresh.setRefreshing(false);
                    }

                    @Override
                    public void onResponse(String response, int id) {
//                        Log.e("TAG", "Home页面联网成功"+response);
                        processData(response, url1);

                        swiperefresh.setRefreshing(false);
                    }
                });

        //推荐主播网址
        url2 = LiveNetWork.LIVE_URL2;
        OkHttpUtils.get()
                .url(url2)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "Home页面联网失败" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
//                        Log.e("TAG", "推荐主播页面联网成功"+response);
                        processData(response, url2);
                    }
                });


        map = new HashMap();
    }

    private void processData(String json, String url) {


//
//        if(url==url1){
//            LiveBean liveBean =   JSON.parseObject(json, LiveBean.class);
//            //得到整个页面解析后的所有java数据
//            data = liveBean.getData();
//            //封装到map集合中
//            map.put(0,data);
//        }else if(url==url2){
//            RecomendBean recomendBean = JSON.parseObject(json, RecomendBean.class);
//            data2=recomendBean.getData();
//            map.put(1,data2);
//        }
//
//        adapter=new LiveAdapter(mContext,map);
//        rvHome.setAdapter(adapter);
//        //设置布局管理器
//        GridLayoutManager manager=new GridLayoutManager(mContext,1);
//        rvHome.setLayoutManager(manager);
//


        //设置recyclerview适配器


        if (url == url1) {
            LiveBean liveBean = JSON.parseObject(json, LiveBean.class);
            //得到整个页面解析后的所有java数据
            data = liveBean.getData();
            //封装到map集合中
            map.put(0, data);

        } else if (url == url2) {
            RecomendBean recomendBean = JSON.parseObject(json, RecomendBean.class);
            data2 = recomendBean.getData();
            map.put(1, data2);

        }


        if (map.get(0) != null && map.get(1) != null) {
            adapter = new LiveAdapter(mContext, map);
            rvHome.setAdapter(adapter);
            //设置布局管理器
            GridLayoutManager manager = new GridLayoutManager(mContext, 1);
            rvHome.setLayoutManager(manager);
        }


//        else if(map.get(1)!=null){
//            adapter = new LiveAdapter(mContext, map);
//            rvHome.setAdapter(adapter);
//            //设置布局管理器
//            GridLayoutManager manager = new GridLayoutManager(mContext, 1);
//            rvHome.setLayoutManager(manager);
//        }


//        else{
//            Toast.makeText(mContext,"没有请求到数据",Toast.LENGTH_SHORT).show();
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    //是否加载更多
//    private boolean isLoadMore=false;
//
//    private class MyMaterialRefreshListener extends MaterialRefreshListener{
//
//
//        @Override
//        public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
//
//            isLoadMore=false;
//
//            getDataFromNet();
//
//        }
//    }


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        // TODO: inflate a fragment view
//        View rootView = super.onCreateView(inflater, container, savedInstanceState);
//        ButterKnife.bind(this, rootView);
//        return rootView;
//    }


}
