package com.album;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;

    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String titleOfSong) {
        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(titleOfSong)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber) {
        return true;
    }
}
