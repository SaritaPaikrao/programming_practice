package org.example;

import java.io.*;
import java.util.*;

public class PairOfSongByTime {

    public static List<String> findPair(List<Song> songs) {
        Map<Integer, String> durationToSong = new HashMap<>();
        int target = 7 * 60; // 420 seconds

        for (Song song : songs) {
            int durationInSeconds = song.getDurationInSeconds();
            int complement = target - durationInSeconds;

            if (durationToSong.containsKey(complement)) {
                return Arrays.asList(durationToSong.get(complement), song.name);
            }

            durationToSong.put(durationInSeconds, song.name);
        }

        return Collections.emptyList();
    }

    public static class Song {
        String name;
        String duration; // format "mm:ss"

        public Song(String name, String duration) {
            this.name = name;
            this.duration = duration;
        }

        public int getDurationInSeconds() {
            String[] parts = duration.split(":");
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);
            return minutes * 60 + seconds;
        }
    }

    public static void main(String[] argv) {

        List<Song> songTimes = Arrays.asList(
                new Song("Stairway to Heaven", "8:05"),
                new Song("Immigrant Song", "2:27"),
                new Song("Rock and Roll", "3:41"),
                new Song("Communication Breakdown", "2:29"),
                new Song("Good Times Bad Times", "2:48"),
                new Song("Black Dog", "4:55"),
                new Song("The Crunge", "3:18"),
                new Song("Achilles Last Stand", "10:26"),
                new Song("The Ocean", "4:31"),
                new Song("Hot Dog", "3:19")
        );

        List<String> result = findPair(songTimes);
        System.out.println(result);


    }
}







