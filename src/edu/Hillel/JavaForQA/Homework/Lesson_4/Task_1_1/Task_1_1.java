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

       public static void tellItLikeItIs(String text) {

        if (day.toString() == todayIs()) {

            switch (day) {
                case MONDAY:
                    System.out.println("Mondays are bad.");
                    break;

                case FRIDAY:
                    System.out.println("Fridays are better.");
                    break;

                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekends are best.");
                    break;

                default:
                    System.out.println("Midweek days are so-so.");
                    break;
            }
        }

    }



    public static void main(String[] args) {

        tellItLikeItIs(todayIs());

    }
}
