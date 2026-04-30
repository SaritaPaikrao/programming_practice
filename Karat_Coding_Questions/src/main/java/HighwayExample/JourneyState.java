package HighwayExample;

public class JourneyState {
    LogEntry last;           // last log entry seen on-highway
    int segments120OrMore;   // count of 10km segments >= 120 km/h
    boolean flagged;         // whether speeding already detected for this journey

    JourneyState(LogEntry start) {
        this.last = start;
        this.segments120OrMore = 0;
        this.flagged = false;

    }
}