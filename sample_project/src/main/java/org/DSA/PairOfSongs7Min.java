package org.DSA;

import java.util.*;

public class PairOfSongs7Min {

    // Returns names of any 2 distinct songs adding to 7:00, else empty list
    public static List<String> findPair(String[][] songTimes) {
        final int totalSec = 7 * 60;
        HashMap<Integer,String> seenSongTime = new HashMap<>();
        for (String[] pair : songTimes) {
            String songName = pair[0];
            int durInSec = getSec(pair[1]);

            int need = totalSec - durInSec;
            if (seenSongTime.containsKey(durInSec)) {
                return Arrays.asList(seenSongTime.get(need), songName);
            }
            seenSongTime.putIfAbsent(need, songName);
        }
        return Collections.emptyList();
    }

    private static int getSec(String s) {
        String[] time = s.split(":");
        int minute = Integer.parseInt(time[0]);
        int sec = Integer.parseInt(time[1]);
        return minute * 60 + sec;
    }

    // Convert "m:ss" to seconds


    public static void main(String[] args) {
        String[][] songTimes1 = {
                {"Stairway to Heaven", "8:05"}, {"Immigrant Song", "2:27"},
                {"Rock and Roll", "3:41"}, {"Communication Breakdown", "2:29"},
                {"Good Times Bad Times", "2:48"}, {"Hot Dog", "3:19"},
                {"The Crunge", "3:18"}, {"Achilles Last Stand", "10:26"},
                {"Black Dog", "4:55"}
        };

        String[][] songTimes2 = {
                {"Stairway to Heaven", "8:05"}, {"Immigrant Song", "2:27"},
                {"Communication Breakdown", "2:29"},
                {"Good Times Bad Times", "2:48"}, {"Black Dog", "4:55"},
                {"The Crunge", "3:18"}, {"Achilles Last Stand", "10:26"},
                {"The Ocean", "4:31"}, {"Hot Dog", "3:19"}
        };

        String[][] songTimes3 = {
                {"Stairway to Heaven", "8:05"}, {"Immigrant Song", "2:27"},
                {"Rock and Roll", "3:41"}, {"Communication Breakdown", "2:29"},
                {"Hey Hey What Can I Do", "4:00"}, {"Poor Tom", "3:00"},
                {"Black Dog", "4:55"}
        };

        String[][] songTimes4 = {
                {"Hey Hey What Can I Do", "4:00"}, {"Rock and Roll", "3:41"},
                {"Communication Breakdown", "2:29"}, {"Going to California", "3:30"},
                {"On The Run", "3:50"}, {"The Wrestler", "3:50"},
                {"Black Mountain Side", "2:11"}, {"Brown Eagle", "2:20"}
        };

        String[][] songTimes5 = {
                {"Celebration Day", "3:30"}, {"Going to California", "3:30"}
        };

        String[][] songTimes6 = {
                {"Rock and Roll", "3:41"}, {"If I lived here", "3:59"},
                {"Day and night", "5:03"}, {"Tempo song", "1:57"}
        };

        System.out.println("findPair(songTimes1) => " + findPair(songTimes1));
        System.out.println("findPair(songTimes2) => " + findPair(songTimes2));
        System.out.println("findPair(songTimes3) => " + findPair(songTimes3));
        System.out.println("findPair(songTimes4) => " + findPair(songTimes4));
        System.out.println("findPair(songTimes5) => " + findPair(songTimes5));
        System.out.println("findPair(songTimes6) => " + findPair(songTimes6));
    }

}
