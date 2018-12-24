package com.zplay.playable.bob.iqzonesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.iqzone.android.AdEventsListener;
import com.iqzone.android.IQzoneBannerView;
import com.iqzone.android.IQzoneInterstitialAdManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "cccBB";
    public IQzoneInterstitialAdManager imdRewardedVideoAdManager;
    IQzoneBannerView mIQzoneBannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIQzoneBannerView = findViewById(R.id.imd_banner_ad);
        mIQzoneBannerView.loadAd("UkJ1RVVoQmxOQkdub0RaWFFoVjVYNTRHRHVEQlJycWVacEZBQnppbitZdzEwcThY", 0, newAdEventListener());
        
        imdRewardedVideoAdManager = new IQzoneInterstitialAdManager(this, "MFllRXhOZ1Nnbi9ycVQ2emRCVW1hdlI2SlZ2bzB4WVc4SWZFUUJCb0EzTW8xRXlw", imdRewardedVideoListener);
        imdRewardedVideoAdManager.loadInterstitial();
    }


    private AdEventsListener newAdEventListener() {
        return new AdEventsListener() {
            @Override
            public void adLoaded() {
                Log.d(TAG, "adLoaded: ");
            }

            @Override
            public void adImpression() {
                Log.d(TAG, "adImpression: ");
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
            public void videoCompleted(boolean b) {
                Log.d(TAG, "videoCompleted: ");
            }

            @Override
            public void adDismissed() {
                Log.d(TAG, "adDismissed: ");
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        imdRewardedVideoAdManager.onAttached(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        imdRewardedVideoAdManager.onDetached();
    }

    public void loadRewardedVideo(View view) {
        imdRewardedVideoAdManager.loadInterstitial();
        
    }

    public void showRewardedVideo(View view) {
        imdRewardedVideoAdManager.showInterstitial();
        Log.d("aaaBB", "showRewardedVideo: ");
    }


    //Begin rewarded video event listeners
    final AdEventsListener imdRewardedVideoListener = new AdEventsListener() {
        @Override
        public void adLoaded() {
            Log.d(TAG, "rv: adLoaded: ");
        }

        @Override
        public void adImpression() {
            Log.d(TAG, "rv: adImpression: ");
        }

        @Override
        public void adDismissed() {
            Log.d(TAG, "rv: adDismissed: ");
        }

        @Override
        public void adFailedToLoad() {
            Log.d(TAG, "rv: adFailedToLoad: ");
        }

        @Override
        public void videoStarted() {
            Log.d(TAG, "rv: videoStarted: ");
        }

        @Override
        public void videoCompleted(boolean skipped) {
            Log.d(TAG, "rv: videoCompleted: " + skipped);
        }
    };

}

