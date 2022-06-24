package com.example.auth_user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, password;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

     name.setOnTouchListener(new View.OnTouchListener() {
         @Override
         public boolean onTouch(View view, MotionEvent motionEvent) {
             textView.setText("");
             return false;
         }
     });

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String uname = name.getText().toString();
             String pass = password.getText().toString();

             if((uname.equals("Sahil")) && (pass.equals("password"))){
                 Toast.makeText(MainActivity.this, "Valid User", Toast.LENGTH_SHORT).show();
                 textView.setText("Valid User");
             }
             else{
                 Toast.makeText(MainActivity.this, "Invalid User", Toast.LENGTH_SHORT).show();
                 textView.setText("Invalid User");
             }
         }
     });
    }
}