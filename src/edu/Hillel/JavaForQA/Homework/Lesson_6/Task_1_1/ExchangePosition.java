package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_1_1;

public class ExchangePosition {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
