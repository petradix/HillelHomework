package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MouseMap {

        private int mouseNumber;

        MouseMap(int mouseNumber) {
            this.mouseNumber = mouseNumber;
        }

        public static void main(String[] args) {
            Map<String, MouseMap> mouseMap = new HashMap<>();
            mouseMap.put("Fuzzy", new MouseMap(3));
            mouseMap.put("Spot", new MouseMap(5));

            Iterator<String> iterator = mouseMap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                System.out.println("Key = " + key + ", Value = " + mouseMap.get(key));
            }

            System.out.println("Change to LinkedHashMap: ");
            mouseMap = new LinkedHashMap<>();
            mouseMap.put("Fuzzy", new MouseMap(3));
            mouseMap.put("Spot", new MouseMap(5));

            iterator = mouseMap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                System.out.println("Key = " + key + ", Value = " + mouseMap.get(key));
            }
        }

        void hop() {
            System.out.println("mouseNumber = " + mouseNumber);
        }
}




//(3 points) Modify Exercise 2 so you use an Iterator to move through the List while calling hop( ).
//Take the Mouse class in Exercise 2 and put it into a Map instead,
// associating the name of the Mouse as a String (the key) for each Mouse (the value) you put in the table.
// Get an Iterator for the keySet( ) and use it to move through the Map,
// looking up the Mouse for each key and printing out the key and telling the mouse to hop( ).