package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_3;

import java.util.Random;

public class Car implements Runnable{

    private int carNumber;
    private String teamName;
    private Track track;

    public Car(int carNumber, String teamName, Track track) {
        this.carNumber = carNumber;
        this.teamName = teamName;
        this.track = track;
    }

    @Override
    public void run() {

        int laps = 0;

        try {
            track.getStart().await();
            System.out.println(toString() + " is ready!");

            while (laps < track.getNumberOfLaps()) {
                laps++;

                Thread.sleep(new Random().nextInt(100)); //speed emulation
            }

            track.getPositions().add(toString());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(toString() + " is finished ");

    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber=" + carNumber +
                ", teamName='" + teamName + '\'' +
                '}';
    }

}
