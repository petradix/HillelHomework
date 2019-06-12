package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_2;

public class Mouse {

    public static int counter = 1;
    public final int mouseNumber;
    public Mouse(){
        mouseNumber = counter++;
    }
    void hop(){
        System.out.println("Mouse #" + mouseNumber + " is hopping!");
    }
}


//(2 points) Create a new class called Mouse with an int mouseNumber
// that’s initialized in the constructor.
// Give it a method called hop( ) that prints out which mouse number this is,
// and that it’s hopping.
// Create an ArrayList and add a bunch of Mouse objects to the List.
// Now use the get( ) method to move through the List and call hop( ) for each Mouse.