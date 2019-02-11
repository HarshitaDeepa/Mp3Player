package com.example.mp3player;

public class SongsList {


        private String mSong,mArtist;


        public SongsList(String song,String artist)

        {
            mSong = song;
            mArtist = artist;
        }

        public String getSongsList()
        {
            return mSong;
        }

        public String getArtistList()
        {
            return mArtist;
        }

    }


