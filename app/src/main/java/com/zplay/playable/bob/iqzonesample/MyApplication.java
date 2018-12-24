package com.zplay.playable.bob.iqzonesample;

import android.app.Application;
import android.util.Log;

import com.iqzone.android.AdEventsListener;
import com.iqzone.android.IQzoneInterstitialAdManager;

/**
 * Description:
 * <p>
 * Created by lgd on 2018/10/31.
 */

public class MyApplication extends Application {
    private static final String TAG = "aaaBB";
//    public IQzoneInterstitialAdManager imdInterstitialAdManager;


    @Override
    public void onCreate() {
        super.onCreate();
//        imdInterstitialAdManager = new IQzoneInterstitialAdManager(this, "Qjd3TytYVllmRmhTYkp3Ri8yanVHTWNuUDBSSElmdXVoTkcyVTR0WkhRc054M0gv", imdInterstitialListener);
//        imdInterstitialAdManager.loadInterstitial();
    }


    //Begin interstitial event listeners
    final AdEventsListener imdInterstitialListener = new AdEventsListener() {
        @Override
        public void adLoaded() {
            Log.d(TAG, "adLoaded: ");
        }

        @Override
        public void adImpression() {
            Log.d(TAG, "adImpression: ");
        }

        @Override
        public void adDismissed() {
            Log.d(TAG, "adDismissed: ");
        }

        @Override
        public void adFailedToLoad() {
            Log.d(TAG, "adFailedToLoad: ");
        }

        @Override
        public void videoStarted() {
            Log.d(TAG, "videoStarted: ");
        }

        @Override
        public void videoCompleted(boolean skipped) {
            Log.d(TAG, "videoCompleted: " + skipped);
        }
    };

}