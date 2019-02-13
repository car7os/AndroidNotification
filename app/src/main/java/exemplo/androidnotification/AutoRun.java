package exemplo.androidnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoRun extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        context.startService(new Intent(context, ServiceExec.class));

    }
}
