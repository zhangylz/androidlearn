package com.ylzh.day07runstopact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        MainActivity.activityList.add(this);
        ImageButton close = (ImageButton) findViewById(R.id.close); //获取布局文件中的关闭按钮
        close.setOnClickListener(new View.OnClickListener() {  //为关闭按钮创建监听事件
            @Override
            public void onClick(View v) {
                //finish(); //关闭当前Activity
                // all activity must finish.
                MainActivity.closeApp(); // close app
            }
        });
    }
}
