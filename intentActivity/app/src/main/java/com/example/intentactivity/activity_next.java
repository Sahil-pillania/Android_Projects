package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_next extends AppCompatActivity {
    TextView textView , textView2;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);

        String passedString = null;
        Intent intent = getIntent();
        String nm = intent.getStringExtra("name");
        textView2.setText(textView2.getText().toString() + nm);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_next.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}