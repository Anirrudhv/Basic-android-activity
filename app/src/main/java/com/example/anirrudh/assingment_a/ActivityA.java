package com.example.anirrudh.assingment_a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;


public class ActivityA extends AppCompatActivity {

    private TextView threadCount;
    private int threadn = 0;
    private boolean shouldPrintThread = true;

    protected void onCreate(Bundle savedInstanceState) {
        System.out.println(" on Create");
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (savedInstanceState != null) {
        }
        setContentView(R.layout.activity_a);
        threadCount = (TextView)findViewById(R.id.threads_count);

    }
    protected void onRestart() {
        System.out.println(" on Restart ");
        shouldPrintThread = true; //re-start activity (navigate back), should print
        super.onRestart();
    }
    protected void onResume() {
        System.out.println(" on Resume ");
        if (shouldPrintThread == true) {
            printThreadCount();
        }
        super.onResume();
    }

    protected void onPause() {
        System.out.println("on Pause");
        shouldPrintThread = false; //dialog open should not enable thread
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("on Stop ");
        shouldPrintThread = false;
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        shouldPrintThread = false;
        super.onDestroy();
    }

    private void printThreadCount() {
        threadn = threadn + 1;
        threadCount.setText(String.format("%05d", threadn));
    }

    public void startDialog(View v) {
        Intent intent = new Intent(ActivityA.this, DialogActivity.class);
        startActivity(intent);
    }

    public void startActivityB(View v) {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(intent);
    }

    public void closeApp(View v) {
        ActivityA.this.finish();
    }
}
