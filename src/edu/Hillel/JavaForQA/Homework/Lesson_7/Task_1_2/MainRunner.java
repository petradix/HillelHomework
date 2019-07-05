package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_1_2;

import java.util.Random;
import java.util.stream.Stream;

public class MainRunner {
    public static void main(String[] args) {
        SuplierInterface suplierInterface = () -> new Random().nextInt();

        PredicateInterface predicateInterface = value -> value > 0;

        ConsumerInterface consumerInterface =  value -> System.out.println(value);

        Stream.generate(suplierInterface)
                .limit(10)
                .filter(predicateInterface)
                .forEach(consumerInterface);

        System.out.println("----------------");

        Stream.generate(suplierInterface::defaultValue)
                .limit(3)
                .filter(predicateInterface)
                .forEach(consumerInterface);


    }


}



//Implement each of main Java Standard
// Library functional interfaces (supplier, predicate etc.)
// using lambda expressions.
