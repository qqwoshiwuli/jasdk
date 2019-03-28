package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zqzn.faceu.sdk.core.ocrliveness.LivenessEngine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LivenessEngine livenessEngine = new LivenessEngine();
    }
}
