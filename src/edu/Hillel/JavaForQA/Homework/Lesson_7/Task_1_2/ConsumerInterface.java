package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_1_2;

import java.util.function.Consumer;

public interface ConsumerInterface extends Consumer<Integer> {

    @Override
    void accept(Integer integer);
}
