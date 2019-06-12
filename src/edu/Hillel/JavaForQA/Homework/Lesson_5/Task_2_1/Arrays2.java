package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_1;

import java.util.*;

public class Arrays2 {

    public static String toString(double[] a) {
        StringBuffer result = new StringBuffer("[");
        for(int i = 0; i < a.length; i++) {
            result.append(a[i]);
            if(i < a.length - 1)
                result.append(", ");
        }
        result.append("]");
        return result.toString();
    }

    public static void fill(double[] a, DoubleGenerator gen){
        fill(a, 0, a.length, gen);
    }
    public static void
    fill(double[] a, int from, int to, DoubleGenerator gen) {
        for(int i = from; i < to; i++)
            a[i] = gen.next();
    }
    private static Random r = new Random();

    public static class
    RandDoubleGenerator implements DoubleGenerator {
        public double next() {return r.nextDouble();}
    }
}