package com.bilibili.fragment;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Neolee on 2017/3/22.
 * 番剧
 */

public class TvFragment extends BaseFragment {
    private TextView textView;


    @Override
    public View initView() {
        textView=new TextView(mContext);
        textView.setText("关注");
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
