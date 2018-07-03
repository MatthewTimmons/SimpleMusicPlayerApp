package com.example.matthewtimmons.musicmachine;

import android.os.Looper;
import android.util.Log;

public class DownloadThread extends Thread {

    private static final String TAG = DownloadThread.class.getSimpleName();
    public DownloadHandler downloadHandler;

    @Override
    public void run() {
        Looper.prepare();
        downloadHandler = new DownloadHandler();
        Looper.loop();
    }
}
