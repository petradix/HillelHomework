package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_3_1;

import java.util.Arrays;
import java.util.List;

public class Bla {
    public static void main(String[] args) {
        String s = "1,2,3";
        System.out.println(Arrays.asList(s.split(",")));


        List<String> result = Arrays.asList(s.split(","));
        System.out.println(result.get(0));
        System.out.println(result.get(1));
        System.out.println(result.get(2));
    }
}
