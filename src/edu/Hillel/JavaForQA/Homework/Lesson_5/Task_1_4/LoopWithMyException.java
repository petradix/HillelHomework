package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_4;

public class LoopWithMyException {

    public static void main(String args[]) {
        Resumer testResumer = new Resumer();
        while (true) {
            try {
                testResumer.goThroughExeptions();
            } catch (MyException e) {
                System.out.println("Here is my exception --> " + e);
                continue;
            }
            System.out.println("Huh! No more any exceptions...");
            break;
        }
        System.out.println("Success! It is time to rest now!");
    }
}


//
// (3 points) Create your own resumption-like behavior by using a while loop
// that repeats until an exception is no longer thrown.

