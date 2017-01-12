package com.cyril.uuiddemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv, tv1;
    private TelephonyManager manager;
    private String imei;
    private DeviceUuidFactory uuidFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textview);
        tv1 = (TextView) findViewById(R.id.textview1);
        manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        imei = manager.getDeviceId();
        tv.setText(imei);
        uuidFactory = new DeviceUuidFactory(this);
        tv1.setText(uuidFactory.getUuid() + "");
    }
}
