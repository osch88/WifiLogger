package com.example.wifilogger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class WifiService extends Service {

    static final String TAG = "WIFI_SERVICE";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate: Service started");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        // The object for the Thread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                    Log.i(TAG, "onStartCommand: Service has completed the task: " + Integer.toString(i));

            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy: Service is now destroyed");
        super.onDestroy();
    }
}