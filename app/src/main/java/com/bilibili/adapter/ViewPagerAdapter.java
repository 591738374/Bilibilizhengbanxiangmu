package com.bilibili.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bilibili.fragment.BaseFragment;

import java.util.ArrayList;

/**
 * Created by Neolee on 2017/3/21.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] titles = new String[]{"直播", "推荐","番剧","分区","发现"};
    private final ArrayList<BaseFragment> fragments;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<BaseFragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
