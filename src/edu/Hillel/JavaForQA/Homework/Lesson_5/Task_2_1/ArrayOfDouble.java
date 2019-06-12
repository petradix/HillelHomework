package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_1;


public class ArrayOfDouble {

    public static void main(String[] args) {
       double[] doubleArray = new double[10];
        Arrays2.fill(doubleArray, new Arrays2.RandDoubleGenerator());
        System.out.println(Arrays2.toString(doubleArray));

    }
}



//(1 point) Create an array of double
// and fill( ) it using RandDoubleGenerator.
// Print the results.