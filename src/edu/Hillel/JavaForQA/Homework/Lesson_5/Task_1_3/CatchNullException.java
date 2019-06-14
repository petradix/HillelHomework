package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_3;

public class CatchNullException {

    private static Integer myInt = null;

    public static void main(String[] args) {

        try {
            System.out.println("My object is equal to " + myInt.toString());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException at your code!");
            e.printStackTrace();
        }
        try {
            myInt = 10;
            System.out.println("My object is equal to " + myInt.toString());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException again!");
            e.printStackTrace();
        } finally {
            System.out.println("Finally!!! This time everything is fine!");
        }
    }
}


//(2 points) Define an object reference and initialize it to null.
// Try to call a method through this reference.
// Now wrap the code in a try-catch clause to catch the exception.