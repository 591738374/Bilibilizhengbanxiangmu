package com.bilibili.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bilibili.R;
import com.bilibili.live.adapter.LiveAdapter;
import com.bilibili.live.bean.ZhuiFan1Bean;
import com.bilibili.live.bean.ZhuiFanBean;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.bilibili.R.layout.zhuifan;

/**
 * Created by Neolee on 2017/3/22.
 * 发现fragment
 */

public class DiscoverFragment extends BaseFragment {


    @BindView(R.id.rvtui)
    RecyclerView rvtui;

    private LiveAdapter adapter;


    private String urll;

    private String url2;

    private Map map;

    private ZhuiFanBean.ResultBean data;
    private ZhuiFan1Bean.DataBean data2;

    @Override
    public View initView() {

        View view = View.inflate(mContext, zhuifan, null);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void initData() {
        super.initData();

//        getDataFromNet();
    }

//    private void getDataFromNet() {
//
//        //直播页面网址，不要包括推荐主播
//        urll= LiveNetWork.LIVE_URL3;
//
//        OkHttpUtils.get()
//                .url(urll)
//                .build()
//                .execute(new StringCallback() {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//
//                        Log.e("TAG","Home页面联网失败"+e.getMessage());
//
//
//                    }
//
//                    @Override
//                    public void onResponse(String response, int id) {
//
//                        processData(response,urll);
//
//                    }
//                });
//        url2=LiveNetWork.LIVE_URL4;
//
//        OkHttpUtils.get()
//                .url(url2)
//                .build()
//                .execute(new StringCallback() {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//                        Log.e("TAG", "Home页面联网失败" + e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(String response, int id) {
//                        processData(response, url2);
//
//                    }
//                });
//
//             map=new HashMap();
//
//    }
//
//    private void processData(String json, String url) {
//
//        if(url==urll) {
//
//            ZhuiFanBean zhuifan= JSON.parseObject(json,ZhuiFanBean.class);
//
//            //得到整个页面解析后的所有java数据
//            data=zhuifan.getResult();
//
//            //封装到map集合中
//            map.put(0,data);
//
//
//        }else if(url==url2) {
//            ZhuiFan1Bean zhuifan1=JSON.parseObject(json,ZhuiFan1Bean.class);
//
//            data2=zhuifan1.getData();
//
//            map.put(1,data2);
//
//
//        }
//
//        if(map.get(0)!=null&&map.get(1)!=null) {
//
//            adapter=new LiveAdapter(mContext,map);
//
//            rvtui.setAdapter(adapter);
//
//            //设置布局管理器
//            GridLayoutManager manager=new GridLayoutManager(mContext,1);
//
//            rvtui.setLayoutManager(manager);
//
//
//        }
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }



}
