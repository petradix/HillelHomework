package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_2_2;

import java.util.Arrays;
import java.util.List;

public class HappyNum {


    public static void main(String[] args) {

        System.out.println(textNumbers(Arrays.asList("33", "2424"), 10));


    }

    public static List<String> textNumbers(List<String> values, int tryNum) {


        if (values.size() <= 1 || tryNum == 0) {

            return values;
        }

        int result = 0;

        for (int i = 0; i < values.size(); i++) {
            int value = Integer.valueOf(values.get(i));

            result = result + value * value;

        }

        //System.out.print("First 8 Happy numbers: ");
        System.out.print(result + " ");

        return textNumbers(
                Arrays.asList(
                        String.valueOf(result)
                                .split("")), --tryNum);


    }

}
//    (3 points) Write a Java program to find and print the first 10 happy numbers.
// Happy number: Starting with any positive integer, replace the number by the sum
// of the squares of its digits, and repeat the process until the number equals 1,
// or it loops endlessly in a cycle which does not include 1.
//
// Example: 19 is a happy number
//12 + 92=82
//82 + 22=68
//62 + 82=100
//12 + 02 + 02=1
//
//First 8 Happy numbers:
//1 7 10 13 19 23 28 31