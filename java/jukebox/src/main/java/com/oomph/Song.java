package com.oomph;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private int bpm;

    Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    @Override
    public String toString() {
        return title +": "+ artist;
    }
}
