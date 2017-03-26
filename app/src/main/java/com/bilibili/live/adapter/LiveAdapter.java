package com.bilibili.live.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bilibili.R;
import com.bilibili.live.bean.LiveBean;
import com.bilibili.live.bean.RecomendBean;
import com.bilibili.live.fragment.NoScrollView;
import com.bilibili.utils.CircleImageView;
import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Neolee on 2017/3/22.
 * 直播适配器
 */

public class LiveAdapter extends RecyclerView.Adapter {


    /**
     * 六种类型
     */
    /**
     * 横幅广告
     */
    public static final int BANNER = 0;
    /**
     * 分类
     */
    public static final int ASSORTMENT = 1;

    /**
     * 推荐主播partition
     */
    public static final int PARTITION = 2;

    /**
     * 音乐台
     */
    public static final int YINYUETAI = 3;
    /**
     * 推荐主播partition2
     */
    public static final int PARTITION2 = 4;
    /**
     * 绘画专区
     */
    public static final int DRAWBLE = 5;
    /**
     * 生活娱乐
     */
    public static final int ENTERMENT = 6;

    /**
     * 唱见舞见
     */
    public static final int DANCE = 7;

    /**
     * 手游直播
     */
    public static final int MOBILE = 8;

    /**
     * 绘画专区
     */
    public static final int SINGLE = 9;

    /**
     * 网络游戏
     */
    public static final int ONLINE = 10;

    /**
     * 电子竞技
     */
    public static final int ELECTRIC = 11;

    /**
     * 御宅文化
     */
    public static final int OTAKU = 12;

    /**
     * 放映厅
     */
    public static final int MOVIE = 13;


    /**
     * 当前类型
     */
    public int currentType = BANNER;


//    private Context mContext;
//    private LiveBean.DataBean data;

    LayoutInflater inflater;
    private final Context mContext;
    private final Map map;



    public LiveAdapter(Context mContext, Map map) {
        this.mContext = mContext;
        this.map = map;
        inflater = LayoutInflater.from(mContext);
    }




    //创建视图
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == BANNER) {

            View view = inflater.inflate(R.layout.banner_viewpager, null);
            BannerViewHolder viewHolder = new BannerViewHolder(view);
            return viewHolder;

        } else if (viewType == ASSORTMENT) {

            View view = inflater.inflate(R.layout.assortment, null);
            AssortmentViewHolder viewHolder = new AssortmentViewHolder(view);
            return viewHolder;
        } else if (viewType == PARTITION) {
            View view = inflater.inflate(R.layout.partition_title, null);
            PartitionViewHolder viewHolder = new PartitionViewHolder(view);
            return viewHolder;
        } else if (viewType == YINYUETAI) {
            View view = inflater.inflate(R.layout.yinyuetai, null);
            YinYueTaiViewHolder viewHolder = new YinYueTaiViewHolder(view);
            return viewHolder;
        } else if (viewType == PARTITION2) {
            View view = inflater.inflate(R.layout.partition_bottom, null);
            PartitionViewHolder2 viewHolder = new PartitionViewHolder2(view);
            return viewHolder;
        } else if (viewType == DRAWBLE) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == ENTERMENT) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == DANCE) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == MOBILE) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == SINGLE) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == ONLINE) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == ELECTRIC) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == OTAKU) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }else if (viewType == MOVIE) {
            View view = inflater.inflate(R.layout.standerd_live, null);
            DrawableViewHolder viewHolder = new DrawableViewHolder(view);
            return viewHolder;
        }
        return null;
    }

    //绑定数据
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (getItemViewType(position) == BANNER) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            BannerViewHolder viewHolder = (BannerViewHolder) holder;
            viewHolder.setData(data.getBanner());
        } else if (getItemViewType(position) == PARTITION) {
            RecomendBean.DataBean data2 = (RecomendBean.DataBean) map.get(1);
            PartitionViewHolder viewHolder = (PartitionViewHolder) holder;
            viewHolder.setData(data2.getRecommend_data());
        } else if (getItemViewType(position) == YINYUETAI) {
            RecomendBean.DataBean data2 = (RecomendBean.DataBean) map.get(1);
            YinYueTaiViewHolder viewHolder = (YinYueTaiViewHolder) holder;
            viewHolder.setData(data2.getRecommend_data().getBanner_data());
        } else if (getItemViewType(position) == PARTITION2) {
            RecomendBean.DataBean data2 = (RecomendBean.DataBean) map.get(1);
            PartitionViewHolder2 viewHolder = (PartitionViewHolder2) holder;
            viewHolder.setData(data2.getRecommend_data());
        }else if (getItemViewType(position) == DRAWBLE) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(0));
        }else if (getItemViewType(position) == ENTERMENT) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(1));
        }else if (getItemViewType(position) == DANCE) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(2));
        }else if (getItemViewType(position) == MOBILE) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(3));
        }else if (getItemViewType(position) == SINGLE) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(4));
        }else if (getItemViewType(position) == ONLINE) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(5));
        }else if (getItemViewType(position) == ELECTRIC) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(6));
        }else if (getItemViewType(position) == OTAKU) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(7));
        }else if (getItemViewType(position) == MOVIE) {
            LiveBean.DataBean data = (LiveBean.DataBean) map.get(0);
            DrawableViewHolder viewHolder = (DrawableViewHolder) holder;
            viewHolder.setData(data.getPartitions().get(8));
        }
    }

    @Override
    public int getItemCount() {
        return 14;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == BANNER) {
            currentType = BANNER;
        } else if (position == ASSORTMENT) {
            currentType = ASSORTMENT;
        } else if (position == PARTITION) {
            currentType = PARTITION;
        } else if (position == YINYUETAI) {
            currentType = YINYUETAI;
        } else if (position == PARTITION2) {
            currentType = PARTITION2;
        }else if (position == DRAWBLE) {
            currentType = DRAWBLE;
        }else if (position == ENTERMENT) {
            currentType = ENTERMENT;
        }else if (position == DANCE) {
            currentType = DANCE;
        }else if (position == MOBILE) {
            currentType = MOBILE;
        }else if (position == SINGLE) {
            currentType = SINGLE;
        }else if (position == ONLINE) {
            currentType = ONLINE;
        }else if (position == ELECTRIC) {
            currentType = ELECTRIC;
        }else if (position == OTAKU) {
            currentType = OTAKU;
        }else if (position == MOVIE) {
            currentType =MOVIE;
        }
        return currentType;
    }

    class BannerViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.banner_main)
        Banner bannerMain;


        public BannerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(List<LiveBean.DataBean.BannerBean> banner) {

            List<String> imageUrls = new ArrayList<>();
            for (int i = 0; i < banner.size(); i++) {
                if (banner.size() == 1) {
                    for (int j = 0; j < 2; j++) {
                        String imageurl = banner.get(0).getImg();
                        imageUrls.add(imageurl);
                    }
                } else {
                    String imageurl = banner.get(i).getImg();
                    imageUrls.add(imageurl);
                }
            }

            bannerMain.setBannerStyle(BannerConfig.NOT_INDICATOR);
            bannerMain.setImages(imageUrls)
                    .setImageLoader(new ImageLoader() {
                        @Override
                        public void displayImage(Context context, Object path, ImageView imageView) {
                            Glide.with(context)
                                    .load(path)
                                    .crossFade()
                                    .into(imageView);
                        }
                    })
                    .start();
        }

    }

    class AssortmentViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.linear_assortment)
        LinearLayout linearAssortment;
        @BindView(R.id.foucus)
        LinearLayout foucus;
        @BindView(R.id.center)
        LinearLayout center;
        @BindView(R.id.search)
        LinearLayout search;
        @BindView(R.id.sortall)
        LinearLayout sortall;

        public AssortmentViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class PartitionViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_live_partition_icon)
        ImageView itemLivePartitionIcon;
        @BindView(R.id.item_live_partition_title)
        TextView itemLivePartitionTitle;
        @BindView(R.id.item_live_partition_count)
        TextView itemLivePartitionCount;
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
        @BindView(R.id.insert_linear)
        LinearLayout insertLinear;
        @BindView(R.id.gv_recommend)
        NoScrollView gvRecommend;
        @BindView(R.id.linear_partition)
        LinearLayout linearPartition;


        RecommendGridViewAdapter adapter;

        public PartitionViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(RecomendBean.DataBean.RecommendDataBean recomendBean) {

//            插入部分
            //绑定数据
            List<RecomendBean.DataBean.RecommendDataBean.BannerDataBean> banner_data = recomendBean.getBanner_data();

            if (banner_data.size() > 1) {
                insertLinear.setVisibility(View.VISIBLE);
                Glide.with(mContext)
                        .load(banner_data.get(0).getOwner().getFace())
                        .into(itemLiveUserCover);
                Glide.with(mContext)
                        .load(banner_data.get(0).getCover().getSrc())
                        .into(itemLiveCover);

                itemLiveTitle.setText(banner_data.get(0).getTitle());
                itemLiveUser.setText(banner_data.get(0).getOwner().getName());
                Log.e("TAG", "USER" + banner_data.get(0).getOwner().getName());
                itemLiveCount.setText(Integer.toString(banner_data.get(0).getOnline()));
                Log.e("TAG", "USER" + Integer.toString(banner_data.get(0).getOnline()));
            } else {
                insertLinear.setVisibility(View.GONE);
            }


            String imageurl = recomendBean.getPartition().getSub_icon().getSrc();
            Glide.with(mContext)
                    .load(imageurl)
                    .into(itemLivePartitionIcon);

            itemLivePartitionTitle.setText(recomendBean.getPartition().getName());
            itemLivePartitionCount.setText(Integer.toString(recomendBean.getPartition().getCount()));

            //已经有数据，设置适配器
            adapter = new RecommendGridViewAdapter(mContext, currentType, recomendBean.getLives());
            gvRecommend.setAdapter(adapter);
        }
    }

    class YinYueTaiViewHolder extends RecyclerView.ViewHolder {

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

        public YinYueTaiViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(List<RecomendBean.DataBean.RecommendDataBean.BannerDataBean> banner_data) {

            if (banner_data.size() == 1) {
                //绑定数据
                Glide.with(mContext)
                        .load(banner_data.get(0).getOwner().getFace())
                        .into(itemLiveUserCover);
                Glide.with(mContext)
                        .load(banner_data.get(0).getCover().getSrc())
                        .into(itemLiveCover);

                itemLiveTitle.setText(banner_data.get(0).getTitle());
                itemLiveUser.setText(banner_data.get(0).getOwner().getName());
                itemLiveCount.setText(Integer.toString(banner_data.get(0).getOnline()));
            } else if (banner_data.size() > 1) {
                //绑定数据
                Glide.with(mContext)
                        .load(banner_data.get(1).getOwner().getFace())
                        .into(itemLiveUserCover);
                Glide.with(mContext)
                        .load(banner_data.get(1).getCover().getSrc())
                        .into(itemLiveCover);

                itemLiveTitle.setText(banner_data.get(1).getTitle());
                itemLiveUser.setText(banner_data.get(1).getOwner().getName());
                itemLiveCount.setText(Integer.toString(banner_data.get(1).getOnline()));
            }

        }
    }

    class PartitionViewHolder2 extends RecyclerView.ViewHolder {

        @BindView(R.id.gv_recommend)
        NoScrollView gvRecommend;

        private RecomendBean.DataBean.RecommendDataBean data;

        RecommendGridViewAdapter adapter;

        public PartitionViewHolder2(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }


        public void setData(RecomendBean.DataBean.RecommendDataBean recomendBean) {
            //已经有数据，设置适配器
            adapter = new RecommendGridViewAdapter(mContext, currentType, recomendBean.getLives());
            gvRecommend.setAdapter(adapter);
        }
    }

    class DrawableViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_live_partition_icon)
        ImageView itemLivePartitionIcon;
        @BindView(R.id.item_live_partition_title)
        TextView itemLivePartitionTitle;
        @BindView(R.id.item_live_partition_count)
        TextView itemLivePartitionCount;
        @BindView(R.id.gv_recommend)
        NoScrollView gvRecommend;
        @BindView(R.id.check_more)
        CardView checkMore;
        @BindView(R.id.ref_text)
        TextView refText;
        @BindView(R.id.linear_partition)
        LinearLayout linearPartition;
        StanderedGridAdapter adapter;

        public DrawableViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(LiveBean.DataBean.PartitionsBean partitionsBean) {

            String imageurl = partitionsBean.getPartition().getSub_icon().getSrc();
            Glide.with(mContext)
                    .load(imageurl)
                    .into(itemLivePartitionIcon);

            itemLivePartitionTitle.setText(partitionsBean.getPartition().getName());
            itemLivePartitionCount.setText(Integer.toString(partitionsBean.getPartition().getCount()));

            //已经有数据，设置适配器
            adapter = new StanderedGridAdapter(mContext, currentType, partitionsBean.getLives());
            gvRecommend.setAdapter(adapter);

        }
    }

}