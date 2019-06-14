package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_1;

import java.util.*;

public class inputDoublesToArrays {

    public static String toString(double[] doubleItem) {
        StringBuffer result = new StringBuffer("[");
        for (int i = 0; i < doubleItem.length; i++) {
            result.append(doubleItem[i]);
            if (i < doubleItem.length - 1)
                result.append(", ");
        }
        result.append("]");
        return result.toString();
    }

    public static void fill(double[] doublesNum, DoubleGenerator gen) {
        fill(doublesNum, 0, doublesNum.length, gen);
    }

    public static void
    fill(double[] doublesNum, int from, int to, DoubleGenerator gen) {
        for (int i = from; i < to; i++)
            doublesNum[i] = gen.next();
    }

    private static Random random = new Random();

    public static class
    RandDoubleGenerator implements DoubleGenerator {
        public double next() {
            return random.nextDouble();
        }
    }
}