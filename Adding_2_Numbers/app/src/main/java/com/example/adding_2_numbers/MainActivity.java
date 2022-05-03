package com.example.adding_2_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add;
    TextView textView;
    EditText n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome to the addition world", Toast.LENGTH_SHORT).show();

        add = findViewById(R.id.add);
        textView = findViewById(R.id.textView);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString())  +Integer.parseInt( n2.getText().toString());
                textView.setText("The sum is: " + sum);
            }
        });





    }
}