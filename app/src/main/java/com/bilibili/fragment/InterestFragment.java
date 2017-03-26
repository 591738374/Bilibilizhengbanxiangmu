package com.bilibili.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridView;

import com.bilibili.R;
import com.bilibili.live.adapter.JiuGongGeAdapter;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Neolee on 2017/3/22.
 * 关注
 */

public class InterestFragment extends BaseFragment {


    @BindView(R.id.gv_jiugongge)
    GridView gvJiugongge;
    @BindView(R.id.rvfenqu)
    RecyclerView rvfenqu;

//    private LiveBean.DataBean data;
//
//    private RecomendBean.DataBean data2;

//    private String url1;
//
//    private String url2;

    private Map map;


    private JiuGongGeAdapter adapter;


    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fenqu, null);

        ButterKnife.bind(this,view);

        return view;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public void initData() {
        super.initData();

        adapter = new JiuGongGeAdapter(mContext, map);
        gvJiugongge.setAdapter(adapter);

//        getDataFromNet();
    }

//    private void getDataFromNet() {
//
//        //网址
//        OkHttpUtils.get()
//                .url(url1)
//                .build()
//                .execute(new StringCallback() {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//                        Log.e("TAG", "Home页面联网失败" + e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(String response, int id) {
//
//                        processData(response, url1);
//
//                    }
//                });
//
//        url2 = Constants.BASE_URL;
//
//        OkHttpUtils.get().url(url2)
//                .build()
//                .execute(new StringCallback() {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//                        Log.e("TAG", "Home页面联网失败" + e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(String response, int id) {
//
//                        processData(response, url2);
//                    }
//                });
//
//        map = new HashMap();
//    }
//
//    private void processData(String json, String url) {
//
//        //设置适配器
//        if (url == url1) {
//
//            RecomendBean recomend = JSON.parseObject(json, RecomendBean.class);
//
//            //得到整个页页面解析后所有的java数据
//            data2 = recomend.getData();
//
//            //封装到map集合中
//            map.put(0, data);
//
//        } else if (url == url2) {
//
//            LiveBean live = JSON.parseObject(json, LiveBean.class);
//
//            data = LiveBean.getData();
//
//            map.put(1, data);
//
//        }
//
//        if (map.get(0) != null && map.get(1) != null) {
//
//            adapter = new JiuGongGeAdapter(mContext, map);
//
//            rvfenqu.setAdapter(adapter);
//
//            GridLayoutManager manager = new GridLayoutManager(mContext, 1);
//
//            rvfenqu.setLayoutManager(manager);
//
//        }
//
//
//    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }



//    private void getDataFromNet() {
//
//        OkHttpUtils.get()
//                .url(Constants.HOME_URL)
//                .id(100)
//                .build()
//                .execute(new StringCallback() {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//
//                        Log.e("TAG","联网失败"+e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(String response, int id) {
//
//                        Log.e("TAG","联网请求成功");
//
//                        processedData(response);
//                    }
//                });
//
//    }
//
//    private void processedData(String response){
//
//        HomeBean homeBean= JSON.parseObject(response,HomeBean.class);
//
//        Log.e(TAG, "请求的数据" + homeBean.getResult().getAct_info().get(0).getName());
//
//        resultBean=homeBean.getResult();
//
//        //设置RecycleView的适配器
//        adapter = new InterestAdapter(mContext, homeBean.getResult());
//        rvTuijian.setAdapter(adapter);
//
//        GridLayoutManager manager = new GridLayoutManager(mContext, 1);
//        rvTuijian.setLayoutManager(manager);
//
//
//
//    }


}
