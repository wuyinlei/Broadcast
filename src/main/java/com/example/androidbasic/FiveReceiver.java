package com.example.androidbasic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class FiveReceiver extends BroadcastReceiver {
    public FiveReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "接受一个粘性的广播", Toast.LENGTH_SHORT).show();
    }
}
