package com.bilibili.live.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by Neolee on 2017/3/23.
 * 解决recyclerview嵌套fridview展示数据不全问题
 */

public class NoScrollView extends GridView {
    public NoScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec=MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
