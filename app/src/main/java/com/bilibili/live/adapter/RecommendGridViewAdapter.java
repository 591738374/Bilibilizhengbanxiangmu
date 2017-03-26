package com.bilibili.live.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bilibili.R;
import com.bilibili.live.bean.RecomendBean;
import com.bilibili.utils.CircleImageView;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.bilibili.live.adapter.LiveAdapter.PARTITION;
import static com.bilibili.live.adapter.LiveAdapter.PARTITION2;

/**
 * Created by Neolee on 2017/3/23.
 */

public class RecommendGridViewAdapter extends BaseAdapter {


    private final Context mContext;
    private final List<RecomendBean.DataBean.RecommendDataBean.LivesBean> datas;
    private final int currentType;
    private RecomendBean.DataBean.RecommendDataBean.LivesBean livesBean;

    public RecommendGridViewAdapter(Context mContext, int currentType, List<RecomendBean.DataBean.RecommendDataBean.LivesBean> lives) {
        this.mContext = mContext;
        this.datas = lives;
        this.currentType=currentType;
    }


    @Override
    public int getCount() {
        return datas.size()/2;

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

        if(currentType==PARTITION){
            //根据位置得到相应数据
            livesBean = datas.get(position);
        }else if(currentType==PARTITION2){
            livesBean = datas.get(position+datas.size()/2);
        }


            //绑定数据
            Glide.with(mContext)
                    .load(livesBean.getOwner().getFace())
                    .into(viewHolder.itemLiveUserCover);
            Glide.with(mContext)
                    .load(livesBean.getCover().getSrc())
                    .into(viewHolder.itemLiveCover);

            viewHolder.itemLiveTitle.setText(livesBean.getTitle());
            viewHolder.itemLiveUser.setText(livesBean.getOwner().getName());
            viewHolder.itemLiveCount.setText(Integer.toString(livesBean.getOnline()));
//        Log.e("TAG", "datas大小"+datas.size());


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
