package com.ssjlyy.shaun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ssjlyy.shaun.utils.ToastUtil;

public class MainActivity extends AppCompatActivity {

    //申明变量（组件）
    private Button registerButton;
    private Button loginButton;
    private EditText loginUserName;
    private EditText loginPassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //定义变量（组件）
        registerButton = findViewById(R.id.shaun_register);
        loginButton = findViewById(R.id.shaun_login);
        loginUserName = findViewById(R.id.shaun_userName);
        loginPassWord = findViewById(R.id.shaun_passWord);

        //点击注册按钮
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        //点击登录按钮
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获取前台入参：
                String userName = loginUserName.getText().toString();
                String pwd = loginPassWord.getText().toString();
                //入参判空
                if(!(userName.isEmpty() || pwd.isEmpty())){
                    //不为空：用户名密码校验
                    if(userName.contains("shaun") && pwd.contains("123")){
                        //校验正确跳转到下个页面（会员中心我的余额）
                        String loginSuccessed = "Congratulations, you have successfully logged in, let's go and make money.";

                        //弹框提示登录成功
                        ToastUtil.showMsg(MainActivity.this,loginSuccessed);
                        /*Toast mToast = Toast.makeText(getApplicationContext(), loginSuccessed,Toast.LENGTH_SHORT);
                        mToast.setGravity(Gravity.CENTER,0,0);
                        mToast.show();*/

                        Intent intent = new Intent(MainActivity.this,SlideActivity.class);
                        startActivity(intent);
                    }else if(!(userName.contains("shaun"))) {
                        //非会员，直接跳转游客看广告的地方
                        String loginFailedName = "Sorry, wrong username, login failed.";
                        //弹框提示登录失败
                        ToastUtil.showMsg(MainActivity.this,loginFailedName);

                    }else if(!(pwd.contains("123"))) {
                        //非会员，直接跳转游客看广告的地方
                        String loginFailedPWD = "Sorry, wrong password, login failed.";
                        //弹框提示登录失败
                        ToastUtil.showMsg(MainActivity.this,loginFailedPWD);
                    }else{
                        //其他情况，不管了
                    }
                }else {
                    //入参为空：直接去看一次广告
                    String blackFans = "Are you kidding me?";
                    //弹框提示：你在逗我呢？
                    ToastUtil.showMsg(MainActivity.this,blackFans);

                }


            }
        });



    }
}