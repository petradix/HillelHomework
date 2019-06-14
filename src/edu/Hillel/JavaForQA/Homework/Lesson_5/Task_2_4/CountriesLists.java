package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_4;

import java.util.*;


public class CountriesLists {

    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();
        for (int i = 0; i < CountriesWithCapitals.DATA.length; i++) {
            myArrayList.add(CountriesWithCapitals.DATA[i][0]);
            myLinkedList.add(CountriesWithCapitals.DATA[i][1]);
        }
        Collections.sort(myArrayList);
        Collections.sort(myLinkedList);
        System.out.println("Sorted countries: " + myArrayList);
        System.out.println("Sorted capitals: " + myLinkedList);

        System.out.println("\nTIME FOR SHUFFLE!\n");

        for (int i = 1; i <= 2; i++) {
            Collections.shuffle(myArrayList);
            Collections.shuffle(myLinkedList);
            System.out.println("Shuffled countries " + i + " time: " + myArrayList);
            System.out.println("Shuffled capitals " + i + " time: " + myLinkedList);
        }
    }

}


//(2 points) Create a List (try both ArrayList and LinkedList) and fill it with 5 countries.
// Sort the list and print it,
// then apply Collections.shuffle( ) to the list repeatedly,
// printing it each time so that you can see how the shuffle( ) method randomizes the list differently each time.
