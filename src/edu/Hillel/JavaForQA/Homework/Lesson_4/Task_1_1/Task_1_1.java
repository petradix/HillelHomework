package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_1_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task_1_1 {


  static MyDay day;

    @Override
    public String toString() {
        return "" + day;
    }

    public static String todayIs(){
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        String todayIs = today.name();
        return todayIs;
    }





    public static void main(String[] args) {



    }
}
