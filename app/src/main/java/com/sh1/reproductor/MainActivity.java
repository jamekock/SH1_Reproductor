package com.sh1.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.cancion);
        position = 0;
    }
    public void Play(View v){
        mp.start();
    }
    public void Pause(View v){
        position = mp.getCurrentPosition();
        mp.pause();
    }
    public void Continue(View v){
        mp.seekTo(position);
        mp.start();
    }

    public void Stop(View v){
        position = 0;
        mp.seekTo(position);
        mp.pause();
    }

    public void Circular(View v){

    }

}