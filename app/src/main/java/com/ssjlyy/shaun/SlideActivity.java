package com.ssjlyy.shaun;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.ssjlyy.shaun.utils.ToastUtil;

public class SlideActivity extends AppCompatActivity {

    private ImageView imageViewHead;
    private SlideMenu slideMenu;

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


    }

}
