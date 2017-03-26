package com.bilibili.live.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bilibili.R;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 潘鹏程 on 2017/3/24.
 * 微信:13212223597
 * QQ:591738374
 * 作用:
 */

public class JiuGongGeAdapter extends BaseAdapter {


    private Context context;

    public JiuGongGeAdapter(Context context, Map map) {
        this.context = context;
    }

    private Integer[] images = {

            R.drawable.zhibo,
            R.drawable.fanju,
            R.drawable.donghua,
            R.drawable.guochuang,
            R.drawable.yinyue,
            R.drawable.wudao,
            R.drawable.youxi,
            R.drawable.keji,
            R.drawable.shenghuo,
            R.drawable.guichu,
            R.drawable.shishang,
            R.drawable.guanggao,
            R.drawable.yule,
            R.drawable.dianying,
            R.drawable.dianshiju,
            R.drawable.youxizhongxin
    };
    private String[] texts = {
            "直播",
            "番剧",
            "动画",
            "国创",
            "音乐",
            "舞蹈",
            "游戏",
            "科技",
            "生活",
            "鬼畜",
            "时尚",
            "广告",
            "娱乐",
            "电影",
            "电视剧",
            "游戏中心"

    };


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(context);

            convertView = inflater.inflate(R.layout.item_channel, null);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);

            convertView.setPadding(15,15,15,15);

        }else {

            viewHolder= (ViewHolder) convertView.getTag();


        }
        viewHolder.ivChannel= (ImageView) convertView.findViewById(R.id.iv_channel);

        viewHolder.ivChannel.setBackgroundResource(images[position]);

        viewHolder.tvWudao= (TextView) convertView.findViewById(R.id.tv_wudao);

        viewHolder.tvWudao.setText(texts[position]);

        return convertView;

    }


    static class ViewHolder {
        @BindView(R.id.iv_channel)
        ImageView ivChannel;
        @BindView(R.id.tv_wudao)
        TextView tvWudao;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
