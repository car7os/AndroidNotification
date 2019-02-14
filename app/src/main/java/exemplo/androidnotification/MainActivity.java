package exemplo.androidnotification;

import android.Manifest;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Notification foregroundNote;

        RemoteViews bigView = new RemoteViews(getApplicationContext().getPackageName(),
                R.layout.activity_notification);

// bigView.setOnClickPendingIntent() etc..

        Notification.Builder mNotifyBuilder = new Notification.Builder(this);
        foregroundNote = mNotifyBuilder.setContentTitle("some string")

                .setDefaults(Notification.DEFAULT_ALL)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setTicker("Hearty365")
                //     .setPriority(Notification.PRIORITY_MAX)
                .setContentTitle("Default notification")
                .setContentText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
                .setContentInfo("Info")
                .setOngoing(true)
                .build();

        foregroundNote.bigContentView = bigView;

// now show notification..
        NotificationManager mNotifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotifyManager.notify(1, foregroundNote);



    }

}
