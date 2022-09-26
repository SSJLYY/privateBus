package com.ssjlyy.shaun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.ssjlyy.shaun.utils.ToastUtil;

public class SlideActivity extends AppCompatActivity {

    private ImageView imageViewHead;
    private SlideMenu slideMenu;
    private Button JDButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        imageViewHead = findViewById(R.id.layout_main_head);
        slideMenu = findViewById(R.id.slideMenu);

        //侧滑：
        imageViewHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideMenu.switchMenu();
                ToastUtil.showMsg(SlideActivity.this,"滑滑滑");
            }
        });

        JDButton = findViewById(R.id.bt_main_2);

        //JD车：浏览器打开上车链接
        JDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                //调用电话10086
                //Uri content_url = Uri.parse("tel:10086");
                Uri content_url = Uri.parse("http://47.101.188.128:5701/login");
                intent.setData(content_url);
                startActivity(intent);
            }
        });

    }

}
