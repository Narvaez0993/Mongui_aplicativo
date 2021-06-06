package com.example.mongui2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer cancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cancion=MediaPlayer.create(this,R.raw.saxofon);
        cancion.start();

        TimerTask inicio= new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,Menu.class);
                startActivity(intent);
                finish();

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicio,19000);




    }
}