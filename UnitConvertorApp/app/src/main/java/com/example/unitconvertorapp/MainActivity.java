package com.example.unitconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextTextPersonName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        EditText editText = (EditText)findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Getting the value...", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();

                int kg = Integer.parseInt(s);
                int pound = (int) (2.205 * kg);
                //Toast.makeText(MainActivity.this, (int) pound, Toast.LENGTH_SHORT).show();
                textView.setText("the Pound value is: " + pound);
                //editText.setText("");
            }
        });
    }
}