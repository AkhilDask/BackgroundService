package com.example.backgroundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.startbutton);
        stop = findViewById(R.id.stopbutton);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if (view==start){
            startService(new Intent(this,Service.class));
        }else if (view==stop){
            stopService(new Intent(this,Service.class));
        }

    }
}