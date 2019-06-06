package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_1_2;

import java.util.Random;

public class GetRandomValue {

    //(2 points) Write a Java program which randomly pick up int from Enum
    // (which has 30 int values) and print it to console


    public static EnumWithIntegers randomInteger(){
        int pick = new Random().nextInt(EnumWithIntegers.values().length + 1);
        return EnumWithIntegers.values()[pick];
    }



    public static void main(String[] args) {


        System.out.println("Here is a random Enum -> " + randomInteger().getMyValue());








    }

}

