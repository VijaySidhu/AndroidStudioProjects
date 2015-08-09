package helloworldtutorial.learn.com.helloworldtutorial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by VijaySidhu on 8/9/2015.
 */
public class HelloWorldBroadcastReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();

    }
}
