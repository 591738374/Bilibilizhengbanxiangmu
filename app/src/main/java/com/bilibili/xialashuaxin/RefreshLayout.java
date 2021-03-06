package com.bilibili.xialashuaxin;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.ListView;

import com.bilibili.R;
import com.bilibili.app.MainActivity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by 潘鹏程 on 2017/3/25.
 * 微信:13212223597
 * QQ:591738374
 * 作用:
 */

public class RefreshLayout extends SwipeRefreshLayout implements AbsListView.OnScrollListener {


    //滑动到最下面的上拉操作
    private int mTouchSlop;

    //listView实例
    private ListView mListView;

    //上拉监听器，到了最底部的上拉加载操作
    private OnLoadListener mOnLoadListener;

    //listView的加载中footer
    private View mListViewFooter;

    //按下时的y坐标
    private int mYDown;

    //抬起时的y的坐标
    private int mLastY;

    //是否在加载中
    private boolean isLoading = false;


    public RefreshLayout(Context context) {
        this(context, null);
    }


    public RefreshLayout(Context context, AttributeSet attrs) {

        super(context, attrs);

        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();

        mListViewFooter = LayoutInflater.from(context).inflate(
                R.layout.listview_footer, null, false);

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {

        super.onLayout(changed, left, top, right, bottom);

        if (mListView == null) {
            getListView();

        }
    }

    //获取ListView对象
    private void getListView() {

        int childs = getChildCount();

        if (childs > 0) {

            View childView = getChildAt(0);

            if (childView instanceof ListView) {

                mListView = (ListView) childView;

                //设置滚动监听器给ListView,使得滚动的情况下也可以自动加载
                mListView.setOnScrollListener(this);

                Log.e(VIEW_LOG_TAG, "### 找到listview");

            }

        }


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        final int action = event.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:
                //按下
                mYDown = (int) event.getRawX();

                break;

            case MotionEvent.ACTION_MOVE:
                mLastY = (int) event.getRawY();
                break;

            case MotionEvent.ACTION_UP:
                //抬起

                if (canLoad()) {


                }
                break;
            default:
                break;

        }

        return super.dispatchTouchEvent(event);


    }

    //是否可以加载更多，条件是到了最底部，listView不在加载中

    private boolean canLoad() {

        return isBottom() && isLoading && isPullUp();

    }

    private boolean isBottom() {

        if (mListView != null && mListView.getAdapter() != null) {
            return mListView.getLastVisiblePosition() == (mListView
                    .getAdapter().getCount() - 1);
        }
        return false;
    }

    //是否上拉操作
    private boolean isPullUp(){

        return (mYDown-mLastY)>=mTouchSlop;

    }

    //如果到了最底部，而且是上拉操作，那么执行onLoad方法

    private void  loadData(){

        if(mOnLoadListener!=null) {

            //设置状态
            setLoading(true);

            mOnLoadListener.onLoad();
        }
    }

    public void setLoading(boolean loading){

        isLoading=loading;

        if(isLoading) {
            mListView.addFooterView(mListViewFooter);

        }else {

            mListView.removeFooterView(mListViewFooter);

            mYDown=0;
            mLastY=0;
        }

    }

    public void setOnLoadListener(MainActivity loadListener){

         mOnLoadListener= (OnLoadListener) loadListener;

    }



    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

        //滚动时到了最底部也可以加载更多
        if(canLoad()) {
            loadData();

        }

    }
    //设置刷新
    public static void setRefreshing(SwipeRefreshLayout refreshLayout,
                                     boolean refreshing, boolean notify) {
        Class<? extends SwipeRefreshLayout> refreshLayoutClass = refreshLayout
                .getClass();
        if (refreshLayoutClass != null) {

            try {
                Method setRefreshing = refreshLayoutClass.getDeclaredMethod(
                        "setRefreshing", boolean.class, boolean.class);
                setRefreshing.setAccessible(true);
                setRefreshing.invoke(refreshLayout, refreshing, notify);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
         }
      //加载更多的监听器
    public static interface  OnLoadListener{

          public void onLoad();

      }


}
