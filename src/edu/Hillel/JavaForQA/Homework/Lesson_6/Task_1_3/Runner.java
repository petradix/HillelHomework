package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_1_3;

public class Runner {

    public static void main(String[] args) {

        doSome(new SubOne());
        doSome(new SubTwo());

        doSome2(new SubOne());
        doSome2(new SubTwo());

    }

    public static void doSome(SuperClass s) {
        System.out.println(s.getValue());

    }

    public static <T extends SuperClass> void doSome2(T s) {
        System.out.println(s.getValue());

    }

}


class SuperClass {

    String getValue() {
        return "SuperClass";
    }
}

class SubOne extends SuperClass {
    String getValue() {
        return "SubOne";
    }

}

class SubTwo extends SuperClass {
    String getValue() {
        return "SubTwo";
    }

}


