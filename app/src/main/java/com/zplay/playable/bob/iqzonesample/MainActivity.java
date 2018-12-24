package com.zplay.playable.bob.iqzonesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zplay.playable.bob.iqzonesample.samples.BannerSample;
import com.zplay.playable.bob.iqzonesample.samples.InterstitialSample;
import com.zplay.playable.bob.iqzonesample.samples.VideoSample;

/**
 * Description:
 * <p>
 * Created by lgd on 2018/10/31.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startBanner(View view) {
        start(BannerSample.class);
    }

    public void startVideo(View view) {
        start(VideoSample.class);
    }

    public void startInterstitial(View view) {
        start(InterstitialSample.class);
    }

    private void start(Class<?> cls) {
        Intent i = new Intent(this, cls);
        startActivity(i);
    }

}