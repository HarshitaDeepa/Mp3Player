package com.example.mp3player;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playlist = (TextView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artist);
        artist.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistIntent);
            }
        });

        TextView album = (TextView) findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumIntent);
            }
        });

        TextView song = (TextView) findViewById(R.id.songs);
        song.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, Song.class);
                startActivity(songIntent);
            }
        });

    }
}
