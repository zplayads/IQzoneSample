package com.zplay.playable.bob.iqzonesample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Description:
 * <p>
 * Created by lgd on 2018/12/24.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private FrameLayout mRootContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.base_activity);
        mRootContainer = findViewById(R.id.root_container);
    }

    @Override
    public void setContentView(int layoutResID) {
        mRootContainer.addView(LayoutInflater.from(this).inflate(layoutResID, mRootContainer, false));
    }

    public abstract void loadAd(View view);

    public abstract void showAd(View view);
}
