package com.example.anirrudh.assingment_a;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.view.Window;

public class ActivityB extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_b);
    }

    protected void onRestart() {
        super.onRestart();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void finishB(View v) {

        ActivityB.this.finish();
    }

}