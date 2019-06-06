package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_3_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.String.join;

public class Lexiconograf {

    //(1 point) Write a java program to compare two strings lexicographically,
// ignoring case differences
//
//String 1: Strings are so cool!
//String 2: Strings are so cool
//"Strings are so cool!" is not equal to "Strings are so cool"

    public static void main(String[] args) {
        System.out.println(compareText("A d", "a b"));


       
    }

    public static boolean compareText (String one, String two){
        return one.equalsIgnoreCase(two);
    }

}






