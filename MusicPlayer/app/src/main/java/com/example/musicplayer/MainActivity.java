package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button play, pause, stop;
    MediaPlayer mediaPlayer;

    protected class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            switch(view.getId())
            {
                case R.id.play:
                    mediaPlayer.start();
                    break;
                case R.id.pause:
                    mediaPlayer.pause();
                     break;
                case R.id.stop:
                    mediaPlayer.stop();
                    break;

            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);

        play.setOnClickListener(new MyButtonListener());
        pause.setOnClickListener(new MyButtonListener());
        stop.setOnClickListener(new MyButtonListener());

        mediaPlayer = MediaPlayer.create(this, R.raw.guitar);

    }
}