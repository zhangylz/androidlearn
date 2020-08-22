package com.ylzh.day07runstopact;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static List<Activity> activityList = new LinkedList<Activity>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityList.add(this);
        TextView password = (TextView) findViewById(R.id.wang_mima);   //获取布局文件中的忘记密码
        password.setOnClickListener(new View.OnClickListener() { //为忘记密码创建单击监听事件
            @Override
            public void onClick(View v) {
                //创建Intent对象
//                Intent intent = new Intent(MainActivity.this, PasswordActivity.class);
                Intent intent = new Intent();                   // package name                              class name
                ComponentName componentName = new ComponentName("com.ylzh.day07runstopact", "com.ylzh.day07runstopact.PasswordActivity");
                intent.setComponent(componentName);
                startActivity(intent); //启动Activity
            }
        });
    }

    static void finishAllActivity() {
        for(Activity activity:activityList)
        {
            activity.finish();
        }

        activityList.clear();
    }

    static void closeApp() {
        // all activity must finish.
        finishAllActivity();
        System.exit(0);
    }
}
