package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_4;

public class LoopWithException {

    public static void main(String args[]) {
        Resumer r = new Resumer();
        while(true) {
            try {
                r.f();
            } catch(ResumerException e) {
                System.out.println("Caught " + e);
                continue;
            }
            System.out.println("Got through...");
            break;
        }
        System.out.println("Successful execution");
    }
}


//
// (3 points) Create your own resumption-like behavior by using a while loop
// that repeats until an exception is no longer thrown.

