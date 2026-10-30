package com.oomph;


import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Jukebox {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        //}
        new Jukebox().go();
    }

    public void go() {
        List<Song> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        /*Collections.sort(songList);
        System.out.println(songList);

        ArtistComparator artistComparator = new ArtistComparator();
        songList.sort(artistComparator);
        System.out.println(songList);*/

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<Song> songSet = new HashSet<>(songList);
        System.out.println(songSet);

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);

        songList.sort((one, two) -> Integer.compare(one.getBpm(),two.getBpm()));
        System.out.println(songList);
    }
}