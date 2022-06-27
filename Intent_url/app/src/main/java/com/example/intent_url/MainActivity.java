package com.example.intent_url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText link;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link = findViewById(R.id.link);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String strURL = link.getText().toString();
                if (strURL.indexOf("http://www") < 0) {
                    strURL = "http://www." + strURL;
                }
                Intent implicit = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(strURL));
                startActivity(implicit);
            }
        });
    }
}