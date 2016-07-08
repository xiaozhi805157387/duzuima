package com.sunsun.duzuima.ui.activity;

import android.os.Handler;

import com.sunsun.duzuima.MainActivity;
import com.sunsun.duzuima.R;
import com.sunsun.duzuima.base.BaseActivity;


/**
 * Created by sunsun on 16/6/23.
 */
public class WelcomeActivity extends BaseActivity {
    /**
     * 设置全屏
     */
    @Override
    protected boolean isFullScreen() {
        return true;
    }

    /**
     * 设置布局
     * @return
     */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    /**
     * 逻辑初始化
     */
    @Override
    protected void init() {
        /**
         * 开启一个子线程延迟三秒发送
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MainActivity.openActivity(WelcomeActivity.this);
                finish();       //关闭当前actvity
            }
        },3000);
    }
}
