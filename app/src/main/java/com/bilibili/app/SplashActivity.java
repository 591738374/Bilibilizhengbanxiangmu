package com.bilibili.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.bilibili.R;


public class SplashActivity extends AppCompatActivity {

    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //两秒钟就会执行
                startMainActivity();
            }
        }, 2000);
    }

    /**
     进入主页面
     */
    private void startMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

        //关闭欢迎页面
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //移除所有消息和回调
        handler.removeCallbacksAndMessages(null);
    }
}
