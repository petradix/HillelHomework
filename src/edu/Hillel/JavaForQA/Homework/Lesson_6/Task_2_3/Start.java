package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_2_3;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Start {
    String title() default "Start";
    int version() default 1;
    String text() default  "Start";

}
