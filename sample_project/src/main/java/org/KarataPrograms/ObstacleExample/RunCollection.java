package org.KarataPrograms.ObstacleExample;

import org.javaCertificationPractice.I;

import java.util.*;

public class RunCollection {
    public Course course; // the Course this RunCollection is for
    public List<Run> runs;  // the Run objects for this particular course

    public RunCollection(Course collectionCourse) {
        course = collectionCourse;
        runs = new ArrayList<>();
    }

    public int getNumRuns() {
        // Returns the number of runs in this collection
        return runs.size();
    }

    public void addRun(Run run) {
        // Adds a run to this collection
        if(!run.course.equals(course)) {
            throw new IllegalArgumentException("run's Course is not the same as the RunCollection's");
        }
        runs.add(run);
    }

    public int personalBest() {
        // Returns the best finish time achieved in this RunCollection
        return runs.stream().filter(run -> run.complete).mapToInt(v -> v.getRunTime()).min().orElse(-1);
    }

    public int bestOfBests() {
        int totalCount = 0;
        for (int i = 0; i < course.obstacleCount; i++) {
            final int index = i;
            Optional<Integer> bestMinTime = runs.stream()
                    .filter(run -> run.obstacleTimes.size() > index)
                    .map(run -> run.obstacleTimes.get(index))
                    .min(Integer::compareTo);

            if(bestMinTime.isPresent()) {
                totalCount +=bestMinTime.get();
            }
        }
        return totalCount;
    }
    /* public int bestOfBests() {
        int totalBest = 0;
        for (int i = 0; i < course.obstacleCount; i++) {
            int bestTimeForObstacle = Integer.MAX_VALUE;
            for (Run run : runs) {
                if (run.obstacleTimes.size() > i) {
                    bestTimeForObstacle = Math.min(bestTimeForObstacle, run.obstacleTimes.get(i));
                }
            } // If no run has this obstacle, skip (though by definition, at least one should)
            if (bestTimeForObstacle != Integer.MAX_VALUE) {
                totalBest += bestTimeForObstacle;
            }
        } return
                totalBest;
    } */
}
