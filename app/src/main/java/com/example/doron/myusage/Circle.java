package com.example.doron.myusage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by doron on 6/24/2016.
 */
public class Circle extends View {
    Paint paint;
    public Circle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint = new Paint();
        paint.setColor(Color.BLACK);
        super.onDraw(canvas);
        canvas.drawCircle(10,10,30,paint);
    }






    }

