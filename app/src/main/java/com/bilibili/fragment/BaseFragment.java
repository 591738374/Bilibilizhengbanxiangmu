package com.bilibili.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {

    //上下文
    public Context mContext;

    //BaseFragment被创建的时候回调
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }

    //当系统要创建视图调用此方法
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        return initView();
        return initView();
    }

    //初始化子类视图，由子类强制实现
    public abstract View initView();

    //当activity被创建的时候调用
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }


//     当子类
//     1.需要绑定数据到视图上的时候重写该方法
//     2.联网请求数据得到数据，并且要绑定数据到视图上的时候重写该方法

    public void initData() {

    }
}
