package helloworldtutorial.learn.com.helloworldtutorial;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by VijaySidhu on 8/8/2015.
 */
public class HelloWorldService extends Service {

    /**
     * indicates how to behave if the service is killed
     */
    int mStartMode = 1;
    /**
     * interface for clients that bind
     */
    IBinder mBinder;
    /**
     * indicates whether onRebind should be used
     */
    boolean mAllowRebind;

    /**
     * Called when the service is being created.
     */
    @Override
    public void onCreate() {
    }

    /**
     * The service is starting, due to a call to startService()
     */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Let it continue running until it is stopped
        Toast.makeText(HelloWorldService.this, "Service Started", Toast.LENGTH_SHORT).show();

        return START_STICKY;
    }

    /**
     * A client is binding to the service with bindService()
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    /**
     * Called when all clients have unbound with unbindService()
     */
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }

    /**
     * Called when a client is binding to the service with bindService()
     */
    @Override
    public void onRebind(Intent intent) {
    }

    /**
     * Called when The service is no longer used and is being destroyed
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(HelloWorldService.this, "Service Destroyed", Toast.LENGTH_SHORT).show();
    }

}
