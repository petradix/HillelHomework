package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_1;


public class ArrayOfDouble {

    public static void main(String[] args) {
        double[] doubleArray = new double[10];
        inputDoublesToArrays.fill(doubleArray, new inputDoublesToArrays.RandDoubleGenerator());
        System.out.println(inputDoublesToArrays.toString(doubleArray));

    }
}


//(1 point) Create an array of double
// and fill( ) it using RandDoubleGenerator.
// Print the results.