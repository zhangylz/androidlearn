package com.ylzh.day08keycodevent;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

class HatView extends View {
    public float bitMapX;
    public float bitMapY;
    public int bitMapW;
    public int bitMapH;

    public HatView(Context context) {
        super(context);
        bitMapX = 65;
        bitMapY = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.progressicon);
        canvas.drawBitmap(bitmap, bitMapX, bitMapY, paint);
        bitMapW = bitmap.getWidth();
        bitMapH = bitmap.getHeight();

        if (bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}