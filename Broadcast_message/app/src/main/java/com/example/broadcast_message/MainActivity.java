package com.example.broadcast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("customBroadcastIntent");
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");

        MyReceiver bcr = new MyReceiver();
        registerReceiver(bcr, intentFilter);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("customBroadcastIntent");
                sendBroadcast(intent);
            }
        });

    }
}