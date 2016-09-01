package com.example.doron.myusage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button notifybutton;
    private Button moveToSeek;
    private PendingIntent resultPendingIntent ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notifybutton = (Button) findViewById(R.id.notifyButton);
        notifybutton.setOnClickListener(this);
moveToSeek = (Button) findViewById(R.id.seekbar_btn);
        moveToSeek.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent resultIntent = new Intent(this, MainActivity.class);
        resultPendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.notifyButton:
                int mnotify = 1;
                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
                mBuilder.setSmallIcon(R.drawable.ic_extension_black_24dp).setContentTitle("Check").setContentInfo("Check again" + mnotify);
                mBuilder.addAction(R.drawable.ic_extension_black_24dp, "share it!", resultPendingIntent).addAction(R.drawable.ic_extension_black_24dp, "Star", resultPendingIntent);
                mBuilder.setContentIntent(resultPendingIntent);

                NotificationManager notifymngr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notifymngr.notify(mnotify, mBuilder.build());
                break;
            case R.id.seekbar_btn:
                Intent intent = new Intent(MainActivity.this, seekBarActivity.class);
                startActivity(intent);
                break;
        }
    }
}
