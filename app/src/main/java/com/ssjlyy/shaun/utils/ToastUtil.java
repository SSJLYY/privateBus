package com.ssjlyy.shaun.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtil {

    public static Toast mToast;



    /*
    shaun：弹框提示工具类 20220919
     */
    public static void showMsgCenter(Context context, String msg){
        if(null!=mToast){
            mToast.setText(msg);
        }else{
            mToast = Toast.makeText(context.getApplicationContext(), msg,Toast.LENGTH_SHORT);
        }
        mToast.setGravity(Gravity.CENTER,0,0);
        mToast.show();
    }

    public static void showMsg(Context context, String msg){
        if(null!=mToast){
            mToast.setText(msg);
        }else{
            mToast = Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }
        mToast.show();
    }


}
