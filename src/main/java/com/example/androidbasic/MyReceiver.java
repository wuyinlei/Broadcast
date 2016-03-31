package com.example.androidbasic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 自定义的广播接收器
 */
public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    /**
     * 接受的方法
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        String info = intent.getStringExtra("info");
        Toast.makeText(context, info, Toast.LENGTH_SHORT).show();
    }
}
