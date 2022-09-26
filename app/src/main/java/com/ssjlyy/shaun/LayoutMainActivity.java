package com.ssjlyy.shaun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.ssjlyy.shaun.utils.ToastUtil;

public class LayoutMainActivity extends AppCompatActivity {


    private Button JDButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);

        JDButton = findViewById(R.id.bt_main_2);

        //JD车：
        JDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtil.showMsg(LayoutMainActivity.this,"6666666");
            }
        });


    }

}
