package com.ylzh.day10gesturedetector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener{
    // step1
    Animation[] animations = new Animation[4];
    final int distance = 50;
    private int[] images = new int[]{R.drawable.img01, R.drawable.img02,R.drawable.img03,
            R.drawable.img04, R.drawable.img05,R.drawable.img06,
            R.drawable.img07, R.drawable.img08,R.drawable.img09,
    };
    // step 2
    ViewFlipper flipper;
    GestureDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // step3
        detector = new GestureDetector(MainActivity.this, this);
        flipper = (ViewFlipper)findViewById(R.id.flipper);
        for (int i = 0; i< images.length;i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(images[i]);
            flipper.addView(imageView);
        }

        animations[0] = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        animations[1] = AnimationUtils.loadAnimation(this, R.anim.slide_out_left);
        animations[2] = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        animations[3] = AnimationUtils.loadAnimation(this, R.anim.slide_out_right);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    // step 4
    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        // x left right
        if (motionEvent.getX() - motionEvent1.getX() > distance) {
            flipper.setInAnimation(animations[2]);
            flipper.setOutAnimation(animations[1]);
            flipper.showPrevious();
            return true;
        } else if (motionEvent1.getX() - motionEvent.getX() > distance) {
            flipper.setInAnimation(animations[0]);
            flipper.setOutAnimation(animations[3]);
            flipper.showNext();
            return true;
        }
        return false;
    }

    //step5 touch event  to GestureDetecode handle
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return detector.onTouchEvent(event);
    }
}
