package com.teka.myapplication.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.teka.myapplication.R;
import com.teka.myapplication.databinding.ActivityMainBinding;
import com.teka.myapplication.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    private SplashModel splashScreenModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(SplashActivity.this, LoginActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, 1000);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.trals);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setDuration(700);
        final ImageView splash = (ImageView) findViewById(R.id.imageView);
        splash.startAnimation(animation);
    }
}