package edu.Hillel.JavaForQA.Homework.Lesson_4.Task_1_1;

import java.lang.invoke.MutableCallSite;

public enum MyDay {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURTHDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int position;

    MyDay(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public static String getDay (int position){

        for (int i = 0; i < values().length; i++) {

            if (position == values()[i].getPosition()) {
                return values()[i].name();
            }

        }

        return null;
    }
}
