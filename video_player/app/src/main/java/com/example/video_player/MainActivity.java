package com.example.video_player;

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

        Uri videoUri = Uri.parse("android.resource://\" + getPackageName() + \"/\"\n" +
                "+ R.raw.video");
        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(uriPath);
        vv.setVideoURI(uri);
        //vv.setVideoURI(videoUri);
        vv.setKeepScreenOn(true);
        vv.start();
    }
}