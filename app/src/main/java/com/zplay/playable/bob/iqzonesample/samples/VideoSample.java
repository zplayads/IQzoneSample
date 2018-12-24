package com.zplay.playable.bob.iqzonesample.samples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.iqzone.android.AdEventsListener;
import com.iqzone.android.IQzoneInterstitialAdManager;
import com.zplay.playable.bob.iqzonesample.BaseActivity;

import java.util.HashMap;

public class VideoSample extends BaseActivity {
    private static final String TAG = "VideoSample";
    private IQzoneInterstitialAdManager imdRewardedVideoAdManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRewardVideo();
    }

    @Override
    public void loadAd(View view) {
        Log.d(TAG, "loadAd: ");
        imdRewardedVideoAdManager.loadInterstitial();
    }

    @Override
    public void showAd(View view) {
        Log.d(TAG, "showAd: ");
        imdRewardedVideoAdManager.showInterstitial();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
        imdRewardedVideoAdManager.onAttached(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        imdRewardedVideoAdManager.onDetached();
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
