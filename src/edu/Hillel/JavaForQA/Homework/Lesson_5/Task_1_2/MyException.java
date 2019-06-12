package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_2;

public class MyException extends Exception{

    String exceptionText;

    public MyException(String exceptionText) {
        this.exceptionText = exceptionText;
    }

    public void printMsg() {
        if (exceptionText == "Voldemort") {
            System.out.println("We do not speak his name!");
        } else {
            System.out.println("Welcome on board!");
        }
    }

}
