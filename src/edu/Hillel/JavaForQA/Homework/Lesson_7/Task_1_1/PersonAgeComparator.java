package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_1_1;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {


    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}


