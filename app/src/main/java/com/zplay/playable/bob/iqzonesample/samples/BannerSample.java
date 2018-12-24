package com.zplay.playable.bob.iqzonesample.samples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.iqzone.android.AdEventsListener;
import com.iqzone.android.IQzoneBannerView;
import com.zplay.playable.bob.iqzonesample.BaseActivity;
import com.zplay.playable.bob.iqzonesample.R;

import java.util.HashMap;

public class BannerSample extends BaseActivity {
    private static final String TAG = "BannerSample";

    IQzoneBannerView imdBannerAd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        imdBannerAd = findViewById(R.id.imd_banner_ad);
    }

    @Override
    public void loadAd(View view) {
        Log.d(TAG, "loadAd: ");

    }

    @Override
    public void showAd(View view) {
        Log.d(TAG, "showAd: " + imdBannerAd.isShown());

    }

    @Override
    protected void onResume() {
        super.onResume();
        imdBannerAd.onAttached(this);
        final AdEventsListener imdBannerListener = new AdEventsListener() {

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

        imdBannerAd.loadAd("UkJ1RVVoQmxOQkdub0RaWFFoVjVYNTRHRHVEQlJycWVacEZBQnppbitZdzEwcThY",
                0, //banner refresh interval in seconds
                imdBannerListener,
                new HashMap<String, String>());
    }

    @Override
    protected void onPause() {
        super.onPause();
        imdBannerAd.onDetached();
    }
}
