package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_1;

public class CatchException {

    public static void main(String[] args) {
        try {
            throw new UnsupportedOperationException("Oh my God! It is a disaster!");
        } catch (UnsupportedOperationException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        } finally {
            System.out.println("Hooray! Good that we have the Finally clause!");
        }

    }
}


//(2 point) Create a class with a main( ) that throws an object
// of class Exception inside a try block.
// Give the constructor for Exception a String argument.
// Catch the exception inside a catch clause and print the String argument.
// Add a finally clause and print a message to prove you were there.
