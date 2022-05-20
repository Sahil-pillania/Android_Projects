package com.example.addingtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText first_no, second_no;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_no = findViewById(R.id.first_no);
        second_no = findViewById(R.id.second_no);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a , b, output;
                a = Float.parseFloat(first_no.getText().toString());
                b = Float.parseFloat(second_no.getText().toString());

                output = a +b;
                textView.setText("Result: " + output);
                first_no.setText("");
                second_no.setText("");

            }
        });

    }
}