package com.example.mp3player;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsListAdapter extends ArrayAdapter<SongsList> {

        public SongsListAdapter(Activity context, ArrayList<SongsList> words) {
            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
            // going to use this second argument, so it can be any value. Here, we used 0.
            super(context, 0, words);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            SongsList currentWord = getItem(position);

            TextView songsTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);
            songsTextView.setText(currentWord.getSongsList());

            TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
            artistTextView.setText(currentWord.getArtistList());

            return listItemView;


        }
    }
