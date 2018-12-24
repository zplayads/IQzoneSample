package com.zplay.playable.bob.iqzonesample.samples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.iqzone.android.IQzoneInterstitialAdManager;
import com.zplay.playable.bob.iqzonesample.BaseActivity;
import com.zplay.playable.bob.iqzonesample.MyApplication;

public class VideoSample extends BaseActivity {
    private static final String TAG = "VideoSample";
    private IQzoneInterstitialAdManager imdRewardedVideoAdManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imdRewardedVideoAdManager = ((MyApplication) getApplication()).imdRewardedVideoAdManager;
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

}
