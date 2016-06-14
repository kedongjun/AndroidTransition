package com.h2o2.kedongjun.activitytransition;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        }

        setContentView(R.layout.activity_b);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Explode transition = new Explode();
//            getWindow().setExitTransition(new Explode());
//            getWindow().setEnterTransition(transition);
        }
    }
}
