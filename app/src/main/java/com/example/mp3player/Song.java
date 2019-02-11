package com.example.mp3player;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Song extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        ArrayList<SongsList> words = new ArrayList<SongsList>();
          words.add(new SongsList("Ek main aur ek tu","Jeet Gannguli"));
          words.add(new SongsList("Hamari adhuri kahani","Arijit Singh"));
          words.add(new SongsList( "Piya o re piya","Atif Aslam"));
          words.add(new SongsList( "Tere liye","Shreya Ghoshal"));
          words.add(new SongsList( "Abhi mujh mein kahin","Arijit"));
          words.add(new SongsList( "Kurbaan hua","Vishal"));
          words.add(new SongsList( "Silsila ye chahat ka","Unknown Artist"));
          words.add(new SongsList( "5000 old songs","Mix"));
          words.add(new SongsList( "zor ka jhatka","Raftaar"));
          words.add(new SongsList( "aajaa","Kamal Khaira"));
          words.add(new SongsList( "aa bhi ja sanam","Atif Aslam"));

          SongsListAdapter adapter = new SongsListAdapter(this, words);

          ListView listView = (ListView) findViewById(R.id.list);

          listView.setAdapter(adapter);
    }
}
