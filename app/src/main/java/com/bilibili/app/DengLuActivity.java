package com.bilibili.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bilibili.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DengLuActivity extends AppCompatActivity {

    @BindView(R.id.iv_denglu)
    ImageView ivDenglu;
    @BindView(R.id.tv_denglu)
    TextView tvDenglu;
    @BindView(R.id.tv_wangjimima)
    TextView tvWangjimima;
    @BindView(R.id.ll_denglu)
    LinearLayout llDenglu;
    @BindView(R.id.dengluzhuce)
    RelativeLayout dengluzhuce;
    @BindView(R.id.iv_xiaoren)
    ImageView ivXiaoren;
    @BindView(R.id.iv_bilibili)
    ImageView ivBilibili;
    @BindView(R.id.iv_xiaoren2)
    ImageView ivXiaoren2;
    @BindView(R.id.ll_bilibili)
    LinearLayout llBilibili;
    @BindView(R.id.et_shoujihao)
    EditText etShoujihao;
    @BindView(R.id.ll_lianxiren)
    LinearLayout llLianxiren;
    @BindView(R.id.et_mima)
    EditText etMima;
    @BindView(R.id.ll_mima)
    LinearLayout llMima;
    @BindView(R.id.btn_zhucezhanghao)
    Button btnZhucezhanghao;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.ll_zhucezhuanghao)
    LinearLayout llZhucezhuanghao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dengluzhuce);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.iv_denglu, R.id.tv_wangjimima})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_denglu:
//                Intent intent=new Intent(DengLuActivity.this, MainActivity.class);

                finish();

                break;
            case R.id.tv_wangjimima:


                break;
        }
    }
}
