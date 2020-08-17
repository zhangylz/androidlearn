package com.ylzh.qqlist;

import android.app.ActionBar;
import android.app.Activity;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Chronometer ch;          //定义计时器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);    //设置全屏显示;

        ch = (Chronometer) findViewById(R.id.ch);   //获取计时器组件
        ch.setBase(SystemClock.elapsedRealtime());  //设置起始时间
        ch.setFormat("%s");                         //设置显示时间格式
        ch.start();                                 //开启计时器
        //添加监听器
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                //判断时间计时达到60秒时
//                ch.setText(ch.getText().toString().substring(1));
                //Toast.makeText(MainActivity.this, ch.getText(), Toast.LENGTH_LONG).show();
//                ch.setBase(ch.getBase() + 1);
                if (SystemClock.elapsedRealtime() - ch.getBase() >= 6000) {
                    ch.stop();  //停止计时器
                }


            }
        });

        final TextView textView = new TextView(MainActivity.this);
        textView.setText("9");
        textView.setTextSize(45);
        textView.setTextColor(getResources().getColor(R.color.colorPrimary));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        textView.setLayoutParams(params);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.myLinearLayout);
        linearLayout.addView(textView);
        textView.setGravity(Gravity.RIGHT);
        new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilFinished) {
                Log.i("info", "seconds remaining: " + millisUntilFinished / 1000);
                //ch.setText("" +( millisUntilFinished / 1000) );
                textView.setText("" +( millisUntilFinished / 1000 - 1));
            }

            public void onFinish() {
                Log.i("info", "done!");
            }
        }.start();
    }
}
