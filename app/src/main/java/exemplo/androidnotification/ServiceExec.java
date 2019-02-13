package exemplo.androidnotification;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class ServiceExec extends IntentService {


    public ServiceExec(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Toast.makeText(getApplicationContext(),"START: Servirço auto executável",Toast.LENGTH_LONG);





    }
}
