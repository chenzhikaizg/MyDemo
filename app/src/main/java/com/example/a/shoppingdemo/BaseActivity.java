package com.example.a.shoppingdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;




/**
 * Created by chenzhikai on 17/11/3.
 */
public abstract class BaseActivity extends Activity implements OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        MobclickAgent.setScenarioType(this, E_UM_NORMAL);
//       // MobclickAgent.setDebugMode( true );
//        MobclickAgent.enableEncrypt(false);

    }

    @Override
    public void setContentView(int layoutResID) {
        if(layoutResID==-1){

        }else {
            super.setContentView(layoutResID);
            initView();
            initListener();
            initData();

        }
    }

    /**
     * 获取View对象
     */
    public abstract void initView();

    /**
     * 设置View事件
     */
    public abstract void initListener();

    /**
     * 初始化当前活动数据
     */
    public abstract void initData();

    @Override
    protected void onResume() {
        super.onResume();



    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    public void showLongMsg(String msg) {
        Toast toast=Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void showShortMsg(String msg)
    {
        Toast toast=Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }



    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        setContentView(-1);
        System.gc();

    }

}
