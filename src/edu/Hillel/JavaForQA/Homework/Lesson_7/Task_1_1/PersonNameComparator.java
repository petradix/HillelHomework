package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_1_1;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2){
        return o1.getName().compareTo(o2.getName());
    }
}
