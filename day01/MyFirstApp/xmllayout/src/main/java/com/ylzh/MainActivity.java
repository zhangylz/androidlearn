package com.ylzh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private ImageView[] img=new ImageView[12];
    private int[] imagePath=new int[]{
            R.mipmap.image01,R.mipmap.image02,R.mipmap.image03,R.mipmap.image04,
            R.mipmap.image05,R.mipmap.image06,R.mipmap.image07,R.mipmap.image08,
            R.mipmap.image09,R.mipmap.image10,R.mipmap.image11,R.mipmap.image12,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relatvie);
//        setContentView(R.layout.activity_main);
        // code dyna ui
//        FrameLayout frameLayout = new FrameLayout(this);
//        frameLayout.setBackgroundResource(R.mipmap.kucaiba);
//        setContentView(frameLayout);
//
//        TextView textView = new TextView(this);
//        textView.setText(R.string.start);
//        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
//        textView.setTextColor(Color.rgb(17, 85, 114));
//        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.gravity = Gravity.CENTER;
//        textView.setLayoutParams(params);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示")
//                        .setMessage("游戏有风险，进入需谨慎，真的要进入吗？")
//                        .setPositiveButton("确认", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                Log.i("桌面台球", "进入游戏");
//                            }
//                        })
//                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                Log.i("桌面台球", "退出游戏");
//                            }
//                        }).show();
//            }
//        });
//
//        frameLayout.addView(textView);


        // xml ui code
//        GridLayout gridLayout = findViewById(R.id.layout);
////        for (int i = 0; i<imagePath.length;i++) {
////            img[i]=new ImageView(MainActivity.this);
////            img[i].setImageResource(imagePath[i]);
////            img[i].setPadding(2,2,2,2);
////            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(116, 68);
////            img[i].setLayoutParams(params);
////            gridLayout.addView(img[i]);
////        }

//        // custom view
//        FrameLayout frameLayout = findViewById(R.id.mylayout);
//        final RabbitView rabbitView = new RabbitView(MainActivity.this);
//        frameLayout.addView(rabbitView);
//
//        // move by finger
//        rabbitView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                rabbitView.bitmapX=motionEvent.getX();
//                rabbitView.bitmapY=motionEvent.getY();
//                rabbitView.invalidate();
//                return true;
//            }
//        });
    }
}
