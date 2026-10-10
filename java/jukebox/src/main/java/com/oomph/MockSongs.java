package com.oomph;

import java.util.ArrayList;
import java.util.List;

class MockSongs {
    public static List<Song> getSongStrings() {
        /*List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 Ways");
        return songs;*/
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Somersault", "zero 7", 147));
        return songs;

    }
}