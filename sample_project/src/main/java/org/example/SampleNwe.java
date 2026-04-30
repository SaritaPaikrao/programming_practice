package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class SampleNwe {
    public static class Course {
        public String title;  // The name of the obstacle course
        public int obstacleCount;  // The number of obstacles in the course
        public Course(String courseTitle, int obstacles) {
            title = courseTitle;
            obstacleCount = obstacles;
        }
        @Override
        public boolean equals(Object o) {
            if(!(o instanceof Course)) { return false; }
            Course c = (Course) o;
            return c.title == this.title && c.obstacleCount == this.obstacleCount;//new String("Asha") != new String("Asha")
        }
        @Override
        public int hashCode() {
            return (title == null ? 0 : title.hashCode()) * obstacleCount;
        }
    }
    static class Run {
        /* Data and methods about a single run of the obstacle course */
        public Course course; // The Course object this run is for
        public boolean complete; // true if the run is a full run of the course
        // false if the run is in progress or was aborted
        public List<Integer> obstacleTimes; // The times it took to complete each obstacle
        public Run(Course runCourse) {
            course = runCourse;
            complete = false;
            obstacleTimes = new ArrayList<>();
        }
        public void addObstacleTime(int obstacleTime) {
            // When an obstacle is completed, add the time to the current run.
            // Params:
            //   obstacleTime: the time in seconds it took to complete the obstacle
            if(complete) {
                throw new IllegalStateException("Cannot add obstacle to complete run");
            }
            obstacleTimes.add(obstacleTime);
            if(obstacleTimes.size() == course.obstacleCount) {
                complete = true;
            }
        }
        public int getRunTime() {
            // Returns the total time this run has taken.
            // If the run is not complete, it returns the time taken so far.

            return obstacleTimes.stream().mapToInt(Integer::intValue).sum();
        }
    }

    static class RunCollection {
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
            return runs.stream().filter(r -> r.complete).map(e -> e.getRunTime()).min(Comparator.comparing(Integer::intValue)).orElse(Integer.MAX_VALUE);
        }
        public int bestOfBests(){
            int totalCount = 0;

            for(int i = 0 ; i < course.obstacleCount ; i++) {

                for ()

            }
        return ;
        }
    }
    class Solutionss {
        public static void main(String[] argv) {
            testRun();
            testRunCollection();
            testBestOfBest();
        }
        // This is not a complete test suite, but tests some basic functionality of the above code, and
        // shows some examples of using the code.
        public static void testRun() {
            System.out.println("Running testRun");
            Course testCourse = new Course("Test course", 2);
            Run testRun = new Run(testCourse);
            testRun.addObstacleTime(3);
            assert !testRun.complete : "Test run should not be complete";
            testRun.addObstacleTime(5);
            assert testRun.complete : "Test run should be complete";
            assert testRun.obstacleTimes.equals(new ArrayList<Integer>(List.of(3, 5))) :
                    "obstacleTimes should be [3, 5], was " + testRun.obstacleTimes;
            assert testRun.getRunTime() == 8 : "getRunTime should return 8, returned " + testRun.getRunTime();
            try {
                testRun.addObstacleTime(4);
                assert false : "adding obstacle time to complete run should throw";
            } catch(IllegalStateException e) {
                // expected
            }
        }
        public static RunCollection makeRunCollection(Course course, int[][] obstacleData) {
            // Create a new RunCollection for test purposes.
            // Params:
            //   course: the Course object this RunCollection is for
            //   obstacleData: an int[][]. Each int[] represents obstacle times for a single
            //                 run of the course.
            RunCollection runCollection = new RunCollection(course);
            for(int[] runData : obstacleData) {
                Run run = new Run(course);
                for(int obstacleTime : runData) {
                    run.addObstacleTime(obstacleTime);
                }
                runCollection.addRun(run);
            }
            return runCollection;
        }

        public static void testRunCollection() {
            System.out.println("Running testRunCollection");
            int[][] obstacleData = {
                    {3, 4, 5, 6},
                    {4, 4, 4, 5},
                    {4, 5, 4, 6},
                    {5, 5, 3}   // incomplete
            };
            Course testCourse = new Course("Test course", 4);
            RunCollection runCollection = Solutionss.makeRunCollection(testCourse, obstacleData);
            assertEquals(obstacleData.length, runCollection.getNumRuns());
            assertEquals(17, runCollection.personalBest());
        }

        public static void testBestOfBest() {
            System.out.println("Running testBestOfBest");
            int[][] obstacleData = {
                    {3, 4, 5, 6},
                    {4, 4, 4, 5},
                    {4, 5, 4, 6},
                    {5, 5, 3}   // incomplete
            };
            Course testCourse = new Course("Test course", 4);
            RunCollection collection = new RunCollection(testCourse);
            for(int[] runData : obstacleData){
                Run run = new Run(testCourse);
                for(int time : runData){
                    run.addObstacleTime(time);
                }
                collection.addRun(run);
            }
            // assert collection.bestOfBests() == 15 : "bestOfBest should be 15, was" + collection.bestOfBests();
            assertEquals(15,collection.bestOfBests());
        }
    }
}
