package com.sunsun.duzuima;



import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sunsun.duzuima.base.BaseActivity;
import com.sunsun.duzuima.utils.IntentUtils;
import com.sunsun.sunlibrary.http.HttpUtils;

import rb.popview.PopField;

public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    /**
     *  初始化
     */
    @Override
    protected void init() {
        final ImageView tv = findViewbyId(R.id.iv);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopField popField = PopField.attach2Window(MainActivity.this);
                popField.popView(tv);
                //QQ聊天
//                IntentUtils.chatQQ("805157387");
                //地图查询
//                IntentUtils.geoAddress("26.57","106.72");
                //打开系统联系人列表
//                IntentUtils.openContacts();
                //打开图库选择
//                IntentUtils.openGallery();
                //删除某个APP
//                IntentUtils.uninstallAPK("com.ipeaksoft.pitDadGame");

                HttpUtils.QQ.getHeadImageUrl("805157387");
            }
        });
    }


    /**
     *  BY:记得注册Activity
     */
    public static final void openActivity(Activity mActivity){
        Intent intent = new Intent(mActivity,MainActivity.class);
        mActivity.startActivity(intent);
    }
}
