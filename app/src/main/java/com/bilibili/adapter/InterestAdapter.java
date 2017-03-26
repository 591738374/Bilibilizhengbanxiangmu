//package com.bilibili.adapter;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.GridView;
//
//import com.bilibili.R;
//import com.bilibili.bean.HomeBean;
//
//import java.util.List;
//
///**
// * Created by 潘鹏程 on 2017/3/24.
// * 微信:13212223597
// * QQ:591738374
// * 作用:
// */
//
//public class InterestAdapter  extends RecyclerView.Adapter<InterestAdapter.ChannelViewHolder> {
//
//
//
//
////    private final HomeBean.ResultBean results;
////
//    private final LayoutInflater inflater;
//
//
//    //频道
//    public static final int CHANNEL=1;
//    private final Context mContext;
//
//    /**
//     * 当前类型
//     */
//    public int currentType = CHANNEL;
//    public InterestAdapter(Context mContext) {
//        this.inflater = LayoutInflater.from(mContext);
//        this.mContext=mContext;
//    }
//
//
////    public InterestAdapter(Context mContext, HomeBean.ResultBean results) {
////        this.mContext = mContext;
////        this.results = results;
////        this.inflater = LayoutInflater.from(mContext);
////    }
//
//
//
//    @Override
//    public ChannelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        if(viewType==CHANNEL) {
//
//            return  new ChannelViewHolder(mContext,inflater.inflate(R.layout.channel_item,null));
//
//        }
//
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(ChannelViewHolder holder, int position) {
//
//        if(getItemViewType(position)==CHANNEL) {
//            ChannelViewHolder bannerViewHolder = (ChannelViewHolder) holder;
//            //绑定数据
//            bannerViewHolder.setData(results.getBanner_info());
//        }
//
//    }
//
//    @Override
//    public int getItemViewType(int position) {
//        if (position == CHANNEL) {
//            currentType=CHANNEL;
//        }
//        return super.getItemViewType(position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return 1;
//    }
//
//    class ChannelViewHolder extends RecyclerView.ViewHolder{
//
//          private final Context mContext;
//
//         private final GridView gv_channel;
//
//        private ChannelAdapter adapter;
//
////        public ChannelViewHolder(View itemView, Context mContext, GridView gv_channel, ChannelAdapter adapter) {
////            super(itemView);
////            this.mContext = mContext;
////            this.gv_channel = gv_channel;
////            this.adapter = adapter;
////        }
//
//          public ChannelViewHolder(Context mContext,View itemView){
//
//              super(itemView);
//              this.mContext=mContext;
//              gv_channel= (GridView) itemView.findViewById(R.id.gv_channel);
//
//
//          }
//
//
//
//
//
//        public void setData(List<HomeBean.ResultBean.ChannelInfoBean>channelInfoBean){
//
//            //设置GridView的适配器
//            adapter=new ChannelAdapter(mContext,channelInfoBean);
//
//            gv_channel.setAdapter(adapter);
//
//        }
//
//    }
//
//}
