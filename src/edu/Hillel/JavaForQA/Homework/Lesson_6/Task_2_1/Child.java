package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_2_1;

public class Child extends Parent {
    // new m1() method
    // unique to Child class
    private void m1() { System.out.println("From child m1()");}

    // overriding method
    // with more accessibility
    @Override
    public void m2() { System.out.println("From child m2()");}
}
