package com.bilibili.fragment;

import android.content.Intent;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.bilibili.R;
import com.bilibili.app.DengLuActivity;
import com.bilibili.live.adapter.LiveAdapter;
import com.bilibili.live.bean.LiveBean;
import com.bilibili.live.bean.RecomendBean;
import com.bilibili.live.network.LiveNetWork;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

/**
 * Created by Neolee on 2017/3/21.
 * 推荐fragment
 */

public class RecommendFragment extends BaseFragment {


    @BindView(R.id.tv_zonghe)
    TextView tvZonghe;
    @BindView(R.id.tv_dongtai)
    TextView tvDongtai;
    @BindView(R.id.iv_biaoqian)
    ImageView ivBiaoqian;
    @BindView(R.id.ll_zonghedongtai)
    LinearLayout llZonghedongtai;


    @BindView(R.id.rv_tuij)
    RecyclerView rvTuij;



    private LiveBean.DataBean data;

    private LiveAdapter adapter;

    private RecomendBean.DataBean data2;

    private String urll;

    private String url2;

    private Map map;


    @BindView(R.id.srl)
    SwipeRefreshLayout swiperefresh;

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.tuijian, null);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void initData() {
        super.initData();

        getDataFromNet();

        //下拉刷新
        refersh();

    }

    private void refersh() {
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
                        //刷新重新请求 数据
                        getDataFromNet();

                    }
                },500);
            }
        });

    }

    private void getDataFromNet() {

        //直播界面地址，不要包括推荐主播
        urll = LiveNetWork.LIVE_URL1;

        OkHttpUtils.get().url(urll)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "Home页面联网失败==" + e.getMessage());

                        swiperefresh.setRefreshing(false);

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData(response, urll);

                        swiperefresh.setRefreshing(false);

                    }
                });

        //推荐主播网址
        url2 = LiveNetWork.LIVE_URL2;

        OkHttpUtils.get().url(url2)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                        Log.e("TAG", "Home页面联网失败" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData(response, url2);

                    }
                });
        map = new HashMap();

    }

    private void processData(String json, String url) {

        //设置recyclerview适配器
        if (url == urll) {

            LiveBean liveBean = JSON.parseObject(json, LiveBean.class);

            //得到整个页面解析后的所有的java数据
            data = liveBean.getData();

            //封装到map集合中
            map.put(0, data);

        } else if (url == url2) {
            RecomendBean recomendBean
                    = JSON.parseObject(json, RecomendBean.class);

            data2 = recomendBean.getData();

            map.put(1, data2);

        }

        if (map.get(0) != null && map.get(1) != null) {

            adapter = new LiveAdapter(mContext, map);

            rvTuij.setAdapter(adapter);

            //设置布局管理器
            GridLayoutManager manager = new GridLayoutManager(mContext, 1);

            rvTuij.setLayoutManager(manager);


        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick({R.id.tv_zonghe, R.id.tv_dongtai})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_zonghe:
                break;
            case R.id.tv_dongtai:
                Intent intent = new Intent(mContext, DengLuActivity.class);

                startActivity(intent);

                break;

        }
    }
}
