package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_2_1;

public class Runner {

    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
    }
}


//(1 point) Use @Override with some object methods. Override the realization of it.