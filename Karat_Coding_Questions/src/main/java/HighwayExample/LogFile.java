package HighwayExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogFile {
    /*
     * Represents a file containing a number of log lines, converted to LogEntry
     * objects.
     */
    public int countCompleteJourneys(){
        List<String> activeJournies = new ArrayList<>();
        int journyCount = 0;

        for (LogEntry logEntry : logEntries) {
            String key = logEntry.getLicensePlate()+" "+logEntry.getDirection();
            String type = logEntry.getBoothType();
            if ("ENTRY".equals(type)) {
                activeJournies.add(key);
            } else if ("EXIT".equals(type)) {
                //count only if there was a previous unmatched ENTRY
                if (activeJournies.remove(key)) {
                    journyCount++;
                }
            }

        }
        return  journyCount;
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


    /*public int countJourneys() {
        // Map to track whether a vehicle has entered
        int count = 0;
        for (LogEntry log : logEntries) {
            if ("EXIT".equals(log.getBoothType())) {
                count++;
            }
        }
        return count;
    }*/
}
