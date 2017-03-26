package com.bilibili.fragment;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.bilibili.R;
import com.bilibili.adapter.ViewPagerAdapter;
import com.bilibili.live.fragment.LiveFragment;
import com.bilibili.utils.CircleImageView;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Neolee on 2017/3/21.
 * 主页模块fragment
 */

public class HomeFragment extends BaseFragment {


    @BindView(R.id.toolbar_user_avatar)
    CircleImageView toolbarUserAvatar;
    @BindView(R.id.navigation_layout)
    LinearLayout navigationLayout;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.sliding_tabs)
    SlidingTabLayout slidingTabs;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private ArrayList<BaseFragment> fragments;

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_home, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        initFragment();
        //设置适配器
        adapter = new ViewPagerAdapter(getFragmentManager(), fragments);
        viewPager.setAdapter(adapter);

        //关联viewpager
        slidingTabs.setViewPager(viewPager);
    }

    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new LiveFragment()); //直播
        fragments.add(new RecommendFragment());  //推荐
        fragments.add(new DiscoverFragment());  //追番
        fragments.add(new InterestFragment());  //分区
        fragments.add(new CateGoryFragment());   //发现

    }



}
