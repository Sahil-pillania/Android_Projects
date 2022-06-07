package com.example.files_access;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    Button write, read;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        write = findViewById(R.id.write);
        read = findViewById(R.id.read);

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    OutputStream os = openFileOutput("myFlatFile.txt", Context.MODE_PRIVATE);
                    OutputStreamWriter writer = new OutputStreamWriter(os);
                    String text;
                    editText = findViewById(R.id.editText);
                    text = editText.getText().toString();
                    writer.write(text);

                    textView = findViewById(R.id.textView);
                    textView.setText("Content is saved in myFlatFile file.");


                }catch (IOException e){
                    e.printStackTrace();
            }
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fileContent = "";
                try {
                    InputStream is = openFileInput("myFlatFile.txt");
                    InputStreamReader reader = new InputStreamReader(is);
                    BufferedReader bReader = new BufferedReader(reader);
                    String line = "";
                    StringBuffer stringB = new StringBuffer();
                    while ((line = bReader.readLine()) != null) {
                        stringB.append(line);
                        stringB.append('\n');
                    }
                    is.close();
                    fileContent = stringB.toString();

                    textView = findViewById(R.id.textView);
                    textView.setText(fileContent);


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        });
    }
}