package com.bilibili.live.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bilibili.R;
import com.bilibili.live.bean.LiveBean;
import com.bilibili.utils.CircleImageView;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Neolee on 2017/3/23.
 */

public class StanderedGridAdapter extends BaseAdapter {


    private final Context mContext;
    private final List<LiveBean.DataBean.PartitionsBean.LivesBean> datas;
    private final int currentType;

    public StanderedGridAdapter(Context mContext, int currentType, List<LiveBean.DataBean.PartitionsBean.LivesBean> lives) {
        this.mContext = mContext;
        this.datas = lives;
        this.currentType = currentType;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;

    }

    @Override
    public View getView(int position, View convretView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convretView == null) {
            convretView = View.inflate(mContext, R.layout.item_live_gridview, null);
            viewHolder = new ViewHolder(convretView);
            convretView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convretView.getTag();
        }

        //绑定数据
        Glide.with(mContext)
                .load(datas.get(position).getOwner().getFace())
                .into(viewHolder.itemLiveUserCover);
        Glide.with(mContext)
                .load(datas.get(position).getCover().getSrc())
                .into(viewHolder.itemLiveCover);

        viewHolder.itemLiveTitle.setText(datas.get(position).getTitle());
        viewHolder.itemLiveUser.setText(datas.get(position).getOwner().getName());
        viewHolder.itemLiveCount.setText(Integer.toString(datas.get(position).getOnline()));
        return convretView;
    }

    static class ViewHolder {
        @BindView(R.id.item_live_cover)
        ImageView itemLiveCover;
        @BindView(R.id.item_live_user_cover)
        CircleImageView itemLiveUserCover;
        @BindView(R.id.item_live_title)
        TextView itemLiveTitle;
        @BindView(R.id.item_live_user)
        TextView itemLiveUser;
        @BindView(R.id.item_live_count)
        TextView itemLiveCount;
        @BindView(R.id.item_live_layout)
        CardView itemLiveLayout;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
