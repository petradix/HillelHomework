package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_1_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task_1_1 {

//
//(1 point) Write a java program which print in console what day of the week is today.
// Use Enum with list of days.
//


    public static int todayIs(){
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        int todayIs = today.getValue();
        return todayIs;
    }



    public static void main(String[] args) {

        System.out.println("Today is " + MyDay.getDay(todayIs()));



    }
}
