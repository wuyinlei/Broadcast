package com.example.androidbasic;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReceiveActivity extends AppCompatActivity {

    private FiveReceiver mFiveReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        mFiveReceiver = new FiveReceiver();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.wuyinlei.action.MY_BROADCAST_STICKY");
        registerReceiver(mFiveReceiver,filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mFiveReceiver);
    }
}
