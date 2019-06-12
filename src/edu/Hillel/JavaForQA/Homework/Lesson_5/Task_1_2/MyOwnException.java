package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_1_2;



public class MyOwnException {


    public static void main(String[] args){


        try {

            throw new MyException("Voldemort");

        } catch (MyException e) {
            e.printMsg();

        }
        finally {
            System.out.println("Fear of a name only increases fear of the thing itself!");
        }

    }

}


//(2 points) Create your own exception class using the extends keyword.
// Write a constructor for this class that takes a
// String argument and stores it inside the object with a String reference.
// Write a method that prints out the stored String.
// Create a try-catch clause to exercise your new exception.
