package com.example.androidbasic;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button sendNormal;
    private TwoReceiver mTwoReceiver;

    private ThreeReceiver mThreeReceiver;
    private FourReceiver mFourReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendNormal = (Button) findViewById(R.id.sendNormal);
        sendNormal.setOnClickListener(new OnClickListener());
        mTwoReceiver = new TwoReceiver();
        findViewById(R.id.sendOrder).setOnClickListener(new OnClickListener());
        mThreeReceiver = new ThreeReceiver();

        findViewById(R.id.sendSticky).setOnClickListener(new OnClickListener());

        findViewById(R.id.startSticky).setOnClickListener(new OnClickListener());
    }

    /**
     * 自定义的内部click
     */
    class OnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.sendNormal:
                    Intent intent = new Intent("com.wuyinlei.action.BROADCAST");
                    intent.putExtra("info", "我们很有缘,谢谢你收到我");
                    MainActivity.this.sendBroadcast(intent);
                    break;
                case R.id.sendOrder:
                    Intent intentOrder = new Intent("com.wuyinlei.action.MY_BROADCAST");

                    //第一个参数是intent，第二个是接收的权限
                    MainActivity.this.sendOrderedBroadcast(intentOrder, null);
                    break;

                case R.id.sendSticky:
                    Intent intentSticky = new Intent("com.wuyinlei.action.MY_BROADCAST_STICKY");
                    MainActivity.this.sendStickyBroadcast(intentSticky);
                    break;

                case R.id.startSticky:
                    startActivity(new Intent(MainActivity.this, ReceiveActivity.class));
                    break;
            }
        }
    }

    /**
     * 在方法中进行广播注册
     */
    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.wuyinlei.action.BROADCAST");
        registerReceiver(mTwoReceiver, filter);
    }

    /**
     * 在这个方法中反注册
     */
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mTwoReceiver);
    }
}
