package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_3_3;

public class ReverseText {

    //(2 points)  Write a Java program to reverse a string using loop

    public static void main(String[] args) {

        String text2 = "The quick brown fox jumps";
        System.out.println(text2);

        System.out.println(text2.split(""));

        String[] array = text2.split("");


        for (int i = 0; i < array.length / 2; i++) {
            String tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        System.out.println(String.join("", array));

    }
}
