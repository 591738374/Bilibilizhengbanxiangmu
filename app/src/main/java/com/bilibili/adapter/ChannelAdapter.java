package com.bilibili.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bilibili.R;
import com.bilibili.bean.HomeBean;
import com.bilibili.utils.Constants;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 潘鹏程 on 2017/3/24.
 * 微信:13212223597
 * QQ:591738374
 * 作用:
 */

public class ChannelAdapter extends BaseAdapter {

    private final Context mContext;

    private final List<HomeBean.ResultBean.ChannelInfoBean> datas;

    public ChannelAdapter(Context mContext, List<HomeBean.ResultBean.ChannelInfoBean> datas) {
        this.mContext = mContext;
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_channel, null);
            holder=new ViewHolder(convertView);

            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        //根据位置取对应的数据
        HomeBean.ResultBean.ChannelInfoBean channelInfoBean=datas.get(position);

        holder.tvWudao.setText(channelInfoBean.getChannel_name());

        //Gilde请求图片
        Glide.with(mContext)
                .load(Constants.BASE_URL_IMAGE+channelInfoBean.getImage())
                .crossFade()
                .into(holder.ivChannel);



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
