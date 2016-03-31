package com.example.androidbasic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TwoReceiver extends BroadcastReceiver {
    public TwoReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "动态注册的广播", Toast.LENGTH_SHORT).show();
    }
}
