package com.zplay.playable.bob.iqzonesample;

import android.app.Application;
import android.util.Log;

import com.iqzone.android.AdEventsListener;
import com.iqzone.android.IQzoneInterstitialAdManager;

import java.util.HashMap;

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    public IQzoneInterstitialAdManager imdInterstitialAdManager;
    public IQzoneInterstitialAdManager imdRewardedVideoAdManager;

    @Override
    public void onCreate() {
        super.onCreate();

        initInterstitial();

        initRewardVideo();
    }

    private void initInterstitial() {
        //Interstitial event listeners
        final AdEventsListener imdInterstitialListener = new AdEventsListener() {
            @Override
            public void adLoaded() {
                //Take any action you require here
                Log.d(TAG, "adLoaded: ");
            }

            @Override
            public void adImpression() {
                //Take any action you require here
                Log.d(TAG, "adImpression: ");
            }

            @Override
            public void adDismissed() {
                //Take any action you require here
                Log.d(TAG, "adDismissed: ");
            }

            @Override
            public void adFailedToLoad() {
                //Take any action you require here
                Log.d(TAG, "adFailedToLoad: ");
            }

            @Override
            public void videoStarted() {
                //Take any action you require here
                Log.d(TAG, "videoStarted: ");
            }

            @Override
            public void videoCompleted(boolean skipped) {
                //’skipped’ will return true if the video was ended early, false if the user //watched it all the way through
                //Take any action you require here
                Log.d(TAG, "videoCompleted: ");
            }
        };

        imdInterstitialAdManager = new IQzoneInterstitialAdManager(this,
                "Qjd3TytYVllmRmhTYkp3Ri8yanVHTWNuUDBSSElmdXVoTkcyVTR0WkhRc054M0gv", imdInterstitialListener, new HashMap<String, String>());
    }

    private void initRewardVideo() {
        //Rewarded video event listeners
        final AdEventsListener imdRewardedVideoListener = new AdEventsListener() {
            @Override
            public void adLoaded() {
                //Take any action you require here
                Log.d(TAG, "rv: adLoaded: ");
            }

            @Override
            public void adImpression() {
                //Take any action you require here
                Log.d(TAG, "rv: adImpression: ");
            }

            @Override
            public void adDismissed() {
                //Take any action you require here
                Log.d(TAG, "rv: adDismissed: ");
            }

            @Override
            public void adFailedToLoad() {
                //Take any action you require here
                Log.d(TAG, "rv: adFailedToLoad: ");
            }

            @Override
            public void videoStarted() {
                //Take any action you require here
                Log.d(TAG, "rv: videoStarted: ");
            }

            @Override
            public void videoCompleted(boolean skipped) {
                //’skipped’ will be true if video was skipped, false if watched completely
                //Take any action you require here (e.g., issue the reward to the user)
                Log.d(TAG, "rv: videoCompleted: ");
            }
        };

        imdRewardedVideoAdManager = new IQzoneInterstitialAdManager(this,
                "MFllRXhOZ1Nnbi9ycVQ2emRCVW1hdlI2SlZ2bzB4WVc4SWZFUUJCb0EzTW8xRXlw", imdRewardedVideoListener, new HashMap<String, String>());
    }
}
