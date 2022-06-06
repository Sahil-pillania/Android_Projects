package com.example.recording_capturing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    Button capture, recording;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capture = findViewById(R.id.capture);
        recording = findViewById(R.id.recording);

        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int REQUEST_CODE = 1;
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                String filepath = Environment.getExternalStorageDirectory()+ "/picture.jpg";
//                File myImage = new File(filepath);
//                Uri imageUri = Uri.fromFile(myImage);
//                intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
        recording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int REQUEST_CODE = 1;
                Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,1);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });



    }
}