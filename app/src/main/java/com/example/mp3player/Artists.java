package com.example.mp3player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView play = (TextView) findViewById(R.id.nowPlaying);
        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Artists.this, NowPlaying.class);
                startActivity(playIntent);
            }
        });
    }
}
