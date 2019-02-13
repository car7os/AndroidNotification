package exemplo.androidnotification;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;

public class ServiceExec extends IntentService {


    public ServiceExec(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Toast.makeText(getApplicationContext(),"START: Servirço auto executável",Toast.LENGTH_LONG);




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
