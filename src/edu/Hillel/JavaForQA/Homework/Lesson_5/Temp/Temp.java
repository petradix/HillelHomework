package edu.Hillel.JavaForQA.Homework.Lesson_5.Temp;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temp {

    public static void main(String[] args) {
        List<String> demoList = new ArrayList<>();
        demoList.add("Red");
        demoList.add("Green");
        demoList.add("Orange");
        demoList.add("White");
        demoList.add("Black");

        System.out.println(demoList);

        for(String element : demoList){
            System.out.println(element);
        }

        String thirdElement = demoList.get(3);
        System.out.println("Fourth element = " + thirdElement);

        demoList.set(3, "Purpure");
        System.out.println("Fourth element = " + demoList.get(3));

        demoList.remove(3);
        System.out.println(demoList);

        if (demoList.contains("Green")){
            System.out.println("Green found!");
        } else {
            System.out.println("Green not found!");
        }

//        Collections.sort(demoList);
//        System.out.println(demoList);
//
//        Collections.shuffle(demoList);
//        System.out.println(demoList);
//
//        Collections.shuffle(demoList);
//        System.out.println(demoList);
//
//
//        Collections.reverse(demoList);
//        System.out.println(demoList);
//
//        List<String> secondList = demoList.subList(2,4);
//        System.out.println(secondList);

        Collections.swap(demoList, 0, 1);
        System.out.println(demoList);

        demoList.removeAll(demoList);
        System.out.println(demoList);

        System.out.println(demoList.isEmpty());
    }
}
