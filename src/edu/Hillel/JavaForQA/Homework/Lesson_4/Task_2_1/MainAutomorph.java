package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_2_1;

import java.util.Scanner;

//(3 points) Write a Java program which check whether
// a number is an Automorphic number or not.
// (An automorphic number is a number whose square "ends"
// in the same digits as the number itself.
// For example, 52 = 25, 62 = 36, 762 = 5776,
// and 8906252 = 793212890625, so 5, 6, 76
// and 890625 are all automorphic numbers.

public class MainAutomorph {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");

        int num = sc.nextInt();

        long sq_num = num * num;

        String str_num = Integer.toString(num);
        String squareOfNum = Long.toString(sq_num);

        if (squareOfNum.endsWith(str_num)) {
            System.out.format("Number %d is Automorphic Number.", num);
        } else {
            System.out.println("This is not an Automorphic Number.");
        }

        System.out.println();

    }
}
