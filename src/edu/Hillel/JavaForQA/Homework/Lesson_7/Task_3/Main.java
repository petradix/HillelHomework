package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Track track = new Track(100);
        Car car1 = new Car(1, "Minos", track);
        Car car2 = new Car(2, "Heracles", track);
        Car car3 = new Car(3, "Agamemnon", track);
        Car car4 = new Car(4, "Jason", track);
        Car car5 = new Car(5, "Leonidas", track);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(car1);
        executorService.submit(car2);
        executorService.submit(car3);
        executorService.submit(car4);
        executorService.submit(car5);


        System.out.println("------start-------");
        track.startRace();

        while (track.getPositions().size() < 5) {
            Thread.sleep(50);
        }

        executorService.shutdown();

        System.out.println(track.getPositions());

        System.out.println("Race is over");

    }
}
