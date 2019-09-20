package com.cyril.uuiddemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView          tv1;
    private DeviceUuidFactory uuidFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textview1);
        uuidFactory = new DeviceUuidFactory(this);
        tv1.setText(uuidFactory.getUuid() + "");
    }
}
