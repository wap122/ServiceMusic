package com.example.minhl.servicemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playMusic(View view) {
        intent = new Intent(MainActivity.this, Playmusic.class);
        this.startService(intent);
    }

    public void stopMusic(View view) {
        this.stopService(intent);
    }
}
