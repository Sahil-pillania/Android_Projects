package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vv = findViewById(R.id.videoView);
        MediaController mc = new MediaController(this);
        vv.setMediaController(mc);

//        Uri videouri = Uri.parse("android.resource://\" + getPackageName() + \"/\"\n" +
//                "+ R.raw.video_1");
        Uri videouri = Uri.parse("android.resource://" + getPackageName() + "/" +
                + R.raw.video_1);
        vv.setVideoURI(videouri);
        vv.setKeepScreenOn(true);
        vv.start();
    }
}