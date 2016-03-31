package com.example.androidbasic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ThreeReceiver extends BroadcastReceiver {
    public ThreeReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "我是有序的广播1", Toast.LENGTH_SHORT).show();

        //广播传递信息
        Bundle bundle = new Bundle();
        bundle.putString("info","我是有序广播");
        this.setResultExtras(bundle);
    }
}
