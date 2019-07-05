package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_1_2;

import java.util.function.Supplier;

public interface SuplierInterface extends Supplier<Integer> {

    @Override
    Integer get();

    default int defaultValue(){
        return 1;
    }

}


