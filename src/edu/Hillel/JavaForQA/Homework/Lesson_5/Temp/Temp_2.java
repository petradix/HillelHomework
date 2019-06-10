package edu.Hillel.JavaForQA.Homework.Lesson_5.Temp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Temp_2 {

    public static void main(String[] args) {
        Set<String> myDemoSet = new HashSet<>();
        myDemoSet.add("Red");
        myDemoSet.add("Green");
        myDemoSet.add("Black");
        myDemoSet.add("White");
        myDemoSet.add("White");
        myDemoSet.add("Yellow");
        System.out.println(myDemoSet);

//        for (String element: myDemoSet){
//            System.out.println(element);
//        }
//
//        Iterator<String> p = myDemoSet.iterator();
//        while (p.hasNext()){
//            System.out.println(p.next());
//        }

        System.out.println(myDemoSet.size());
//        myDemoSet.removeAll(myDemoSet);
//        System.out.println(myDemoSet.isEmpty());

        HashSet<String> hashSet = (HashSet) ((HashSet<String>) myDemoSet).clone();

        String[] arr = new String[myDemoSet.size()];
        myDemoSet.toArray(arr);
        System.out.println(arr);

        for(String elem: arr){
            System.out.println(elem);
        }

        for (String elem : myDemoSet){
            System.out.println(myDemoSet.contains(elem) ? "Yes" : "No");
        }



    }
}
