package com.example.anirrudh.assingment_a;

/**
 * Created by vanir_sp3er40 on 9/19/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class DialogActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialogue);
    }

    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}