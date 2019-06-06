package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_3_2;

public class ReplaceText {

    //(2 points) Write a Java program to replace each substring of
// a given string that matches the given regular expression with the given replacement
//Sample string : "The quick brown fox jumps over the lazy dog."
// In the above string replace all the fox with cat.

    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        System.out.println(text);

        System.out.println(text.replaceAll("fox", "cat"));

    }
}
