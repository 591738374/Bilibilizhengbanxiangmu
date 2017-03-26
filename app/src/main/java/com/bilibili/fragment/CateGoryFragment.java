package com.bilibili.fragment;

import android.view.View;
import android.widget.TextView;

import com.bilibili.R;

/**
 * Created by Neolee on 2017/3/22.
 * 分区
 */

public class CateGoryFragment extends BaseFragment {
    private TextView textView;


    @Override
    public View initView() {

        View view=View.inflate(mContext, R.layout.faxian,null);

        return view;
    }

    @Override
    public void initData() {
        super.initData();

    }
}
