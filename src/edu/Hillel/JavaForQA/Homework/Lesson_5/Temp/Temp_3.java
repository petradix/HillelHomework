package edu.Hillel.JavaForQA.Homework.Lesson_5.Temp;

import java.util.HashMap;
import java.util.Map;

public class Temp_3 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Red");
        hashMap.put(2, "White");
        hashMap.put(3, "Black");
        hashMap.put(4, "Yellow");
        hashMap.put(5, "Pink");

        for (Map.Entry x : hashMap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap.put(6, "Brown");
        hashMap2.putAll(hashMap);
        for (Map.Entry x : hashMap2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

        System.out.println("Is key '1' exists?");
        if (hashMap.containsKey(1)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
