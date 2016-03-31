package com.example.androidbasic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class FourReceiver extends BroadcastReceiver {
    public FourReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = this.getResultExtras(false);
       String info =  bundle.getString("info");
        Toast.makeText(context, "我是有序的的广播2，接受到的广播是" + info, Toast.LENGTH_SHORT).show();
    }
}
