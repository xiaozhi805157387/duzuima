package com.sunsun.duzuima.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.sunsun.sunlibrary.base.BaseUtils;

/**
 * Created by sunsun on 16/6/21.
 *
 *  基础页面
 */
public abstract class BaseActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        baseInit();
        setContentView(getLayoutId());
        init();


    }

    /**
     * 初始化
     */
    private void baseInit(){
        /**
         * 判断当前是否全屏
         */
        if(isFullScreen()) {
            //设置无标题
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            //设置全屏
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        /**
         * 判断初始类的值是否为空
         */
        if(BaseUtils.mActivity != null){
            BaseUtils.init(this);
        }


    }



    /**
     * 返回布局
     * @return 布局文件Res id
     */
    protected abstract int getLayoutId();

    /**
     * 初始化
     */
    protected abstract void init();


    /**
     * 是否全屏  默认不全屏
     */
    protected boolean isFullScreen(){
        return false;
    }




    /**
     * findViewById
     * @return
     */

    public<T> T findViewbyId(int id){
        return (T)findViewById(id);
    }



}
