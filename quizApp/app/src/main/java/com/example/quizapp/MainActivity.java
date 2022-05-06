package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Is java a person?", "Java was introduced in 1233", "java was created using python?",
            "Java has abstract classes", "Does Java supports interface?"};
    private boolean[] answers = {false, false, false, true , true};
    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no  = findViewById(R.id.no);
        textView = findViewById(R.id.textView);
        textView.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if array is in bounds
                if(index<= questions.length-1 ){

                    // if answer is correct
                    if(answers[index] == true){
                        score ++;
                    }
                    index++;
                    if(index<= questions.length-1 ){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Questions ended. Your score is: "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again...", Toast.LENGTH_SHORT).show();
                }

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if array is in bounds
                if(index<= questions.length-1 ){

                // if answer is correct
                if(answers[index] == false){
                    score ++;
                }
                index++;
                    if(index<= questions.length-1 ){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Questions ended. Your score is: "+score, Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}