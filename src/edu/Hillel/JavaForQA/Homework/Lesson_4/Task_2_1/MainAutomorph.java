package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_2_1;

import java.util.Scanner;

public class MainAutomorph {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");

        int num = sc.nextInt();

        int sq_num = num * num;

        String str_num = Integer.toString(num);
        String squareOfNum = Integer.toString(sq_num);

        if (squareOfNum.endsWith(str_num)) {
            System.out.format("Number %d is Automorphic Number.", num);
        } else {
            System.out.println("This is not an Automorphic Number.");
        }

        System.out.println();

    }
}
