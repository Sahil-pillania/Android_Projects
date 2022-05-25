package com.example.goodmorning;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usr_name, usr_pass;
    Button button;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
        usr_name = findViewById(R.id.usr_name);
        usr_pass = findViewById(R.id.usr_pass);
        button = findViewById(R.id.button);

        usr_name.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                output.setText("");
                return false;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = usr_name.getText().toString();
                String upass = usr_pass.getText().toString();

                if((uname.equals("Sahil pillania")) && (upass.equals("Password1234"))){
                    output.setText("Valid User");
                    Toast.makeText(MainActivity.this, "Valid User", Toast.LENGTH_SHORT).show();
                }
                else{
                    output.setText("Invalid User");
                    Toast.makeText(MainActivity.this, "Invalid User", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}