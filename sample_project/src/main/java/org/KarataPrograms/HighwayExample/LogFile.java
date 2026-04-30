package org.KarataPrograms.HighwayExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LogFile {
    /*
     * Represents a file containing a number of log lines, converted to LogEntry
     * objects.
     */
    public static int countCompleteJourneys(List<LogEntry> logs){
        int count = 0;
        for (LogEntry log : logs) {
            if ("EXIT".equals(log.getBoothType())) {
                count++;
            }
        }
        return count;
    }

    List<LogEntry> logEntries;
    public LogFile(BufferedReader reader) throws IOException {
        this.logEntries = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            LogEntry logEntry = new LogEntry(line.strip());
            this.logEntries.add(logEntry);
            line = reader.readLine();
        }
    }
    public LogEntry get(int index) {
        return this.logEntries.get(index);
    }
    public int size() {
        return this.logEntries.size();
    }


    public int countJourneys() {
        // Map to track whether a vehicle has entered
        int count = 0;
        for (LogEntry log : logEntries) {
            if ("EXIT".equals(log.getBoothType())) {
                count++;
            }
        }
        return count;
    }
}
