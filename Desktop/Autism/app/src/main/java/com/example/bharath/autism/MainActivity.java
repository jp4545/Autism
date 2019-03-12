package com.example.bharath.autism;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.bharath.autism.R.id.activity_colours;

public class MainActivity extends AppCompatActivity {
    View navigationView;
    ImageButton one;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        ImageButton one = (ImageButton)this.findViewById(R.id.imageButton2);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new  Intent(MainActivity.this, colours.class);
                startActivity(i);
            }

        });

ImageButton two = (ImageButton)this.findViewById(R.id.imageButton3);
        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.zapsplat_multimedia_click_001_19367);
        two.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp1.start();
            }
        });

    }



}
