package com.example.doron.myusage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class seekBarActivity extends AppCompatActivity {
    private SeekBar myseekBar;
    private TextView seekbarprogress;
    Paint paint;

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_seek_bar);
//        myseekBar = (SeekBar) findViewById(R.id.seekBar);
//        seekbarprogress = (TextView) findViewById(R.id.seekbartext);
//        paint = new Paint();
//        paint.setColor(Color.BLACK);
//        myseekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//
//            @Override
//            public void onProgressChanged(SeekBar seekBar, final int progress, final boolean fromUser) {
//                seekbarprogress.setText(Integer.toString(progress));
//                Drawable d = new Drawable() {
//                    @Override
//                    public void draw(Canvas canvas) {
//                        canvas.drawCircle(10,10,progress,paint);
//                        canvas.drawLine(300,300,350,350,paint);
//                    }
//
//                    @Override
//                    public void setAlpha(int alpha) {
//
//                    }
//
//                    @Override
//                    public void setColorFilter(ColorFilter colorFilter) {
//
//                    }
//
//                    @Override
//                    public int getOpacity() {
//                        return 0;
//                    }
//                };
//
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.example.doron.myusage",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }

//    private void seekBarText(int how_many)
//    {
//        String what_to_say = String.valueOf(how_many);
//        seekbarprogress.setText(what_to_say);
//        int seek_label_pos = (((myseekBar.getRight() - myseekBar.getLeft()) * myseekBar.getProgress()));
//        if (how_many <=9)
//        {
//            fade_text.setX(seek_label_pos - 6);
//        }
//        else
//        {
//            fade_text.setX(seek_label_pos - 11);
//        }
//        seekbarprogress.setX(seek_label_pos);
//    }
//    private void drawCircleAtPoint(GeoPoint point, Canvas canvas, MapView mapView) {
//
//        Projection projection = mapView.getProjection();
//        Point pt2 = new Point();
//        projection.toPixels(point, pt2);
//// method that is used to conver the radius to pixel that takes input the radius and draw it on the coresponding pixels
//        float circleRadius = projection.metersToEquatorPixels(radius) * (1/ FloatMath.cos((float) Math.toRadians(MapController.mylat)));
//        Paint circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        Paint rectangle=new Paint(Paint.ANTI_ALIAS_FLAG);
//        Log.d("Circular Radius", ""+circleRadius+"             "+radius);
//
//        circlePaint.setColor(0x99000000);
//        circlePaint.setStyle(Style.STROKE);
//        canvas.drawCircle((float) pt2.x, (float) pt2.y, circleRadius, circlePaint);
//
//
//

    }

}