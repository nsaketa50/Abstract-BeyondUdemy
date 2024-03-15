package com.album;

import java.util.ArrayList;

public class Song {
    String title;
    double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getTitle() + " : " + duration;
    }

}
