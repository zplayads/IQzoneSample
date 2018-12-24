package com.zplay.playable.bob.iqzonesample.samples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.iqzone.android.AdEventsListener;
import com.iqzone.android.IQzoneInterstitialAdManager;
import com.zplay.playable.bob.iqzonesample.BaseActivity;

import java.util.HashMap;

public class InterstitialSample extends BaseActivity {
    private static final String TAG = "InterstitialSample";
    private IQzoneInterstitialAdManager imdInterstitialAdManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initInterstitial();
    }

    @Override
    public void loadAd(View view) {
        Log.d(TAG, "loadAd: ");
        imdInterstitialAdManager.loadInterstitial();
    }

    @Override
    public void showAd(View view) {
        Log.d(TAG, "showAd: ");
        imdInterstitialAdManager.showInterstitial();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
        imdInterstitialAdManager.onAttached(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
        imdInterstitialAdManager.onDetached();
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
                Log.d(TAG, "videoCompletEgretLoadered: ");
            }
        };

        imdInterstitialAdManager = new IQzoneInterstitialAdManager(this,
                "Qjd3TytYVllmRmhTYkp3Ri8yanVHTWNuUDBSSElmdXVoTkcyVTR0WkhRc054M0gv", imdInterstitialListener, new HashMap<String, String>());
    }
}

