package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_2_3;


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Procces procces = new Procces();

       Method methodInit = procces.getClass().getDeclaredMethod("init");

        System.out.println();

        System.out.println(methodInit.getDeclaredAnnotations()[0].toString());
    }
}


//(3 points) Write new annotation with few String fields (with default values).
// Use it in your program: declare some values/methods with this annotation and use Strings of it