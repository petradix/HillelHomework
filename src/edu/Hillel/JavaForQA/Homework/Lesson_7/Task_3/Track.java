package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_3;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

public class Track {

    private int numberOfLaps;
    private ConcurrentLinkedQueue positions = new ConcurrentLinkedQueue();
    private CountDownLatch start = new CountDownLatch(1);


    public Track(int numberOfLaps) {
        this.numberOfLaps = numberOfLaps;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }

    public ConcurrentLinkedQueue getPositions() {
        return positions;
    }

    public CountDownLatch getStart() {
        return start;
    }

    public void startRace() {
        this.start.countDown();
    }
}
