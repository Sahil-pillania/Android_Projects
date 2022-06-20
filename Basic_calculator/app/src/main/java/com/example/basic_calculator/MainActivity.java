package com.example.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text1, text_2;
    TextView textView;
    Button add, sub, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text_2 = findViewById(R.id.text_2);
        textView = findViewById(R.id.textView3);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    float f_no, s_no, ans;

                    f_no = Float.parseFloat(text1.getText().toString());
                    s_no = Float.parseFloat(text_2.getText().toString());
                    ans = f_no + s_no;

                    textView.setText("ANSWER IS : "+ ans);
                    text1.setText("");
                    text_2.setText("");

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f_no, s_no, ans;

                f_no = Float.parseFloat(text1.getText().toString());
                s_no = Float.parseFloat(text_2.getText().toString());
                ans = f_no - s_no;

                textView.setText("ANSWER IS : "+ ans);
                text1.setText("");
                text_2.setText("");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f_no, s_no, ans;

                f_no = Float.parseFloat(text1.getText().toString());
                s_no = Float.parseFloat(text_2.getText().toString());
                ans = f_no * s_no;

                textView.setText("ANSWER IS : "+ ans);
                text1.setText("");
                text_2.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f_no, s_no, ans;

                f_no = Float.parseFloat(text1.getText().toString());
                s_no = Float.parseFloat(text_2.getText().toString());
                ans = f_no / s_no;

                textView.setText("ANSWER IS : "+ ans);
                text1.setText("");
                text_2.setText("");
            }
        });

    }
}