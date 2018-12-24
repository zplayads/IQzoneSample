package com.zplay.playable.bob.iqzonesample.samples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.iqzone.android.IQzoneInterstitialAdManager;
import com.zplay.playable.bob.iqzonesample.BaseActivity;
import com.zplay.playable.bob.iqzonesample.MyApplication;

public class InterstitialSample extends BaseActivity {
    private static final String TAG = "InterstitialSample";
    private IQzoneInterstitialAdManager imdInterstitialAdManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imdInterstitialAdManager = ((MyApplication)getApplication()).imdInterstitialAdManager;
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
}

