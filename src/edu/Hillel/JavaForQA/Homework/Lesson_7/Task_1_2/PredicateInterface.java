package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_1_2;

import java.util.function.Predicate;

public interface PredicateInterface extends Predicate<Integer> {

    @Override
    boolean test(Integer value);
}
