package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_5;

import java.util.*;

public class HashMapper {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

    public void fillHashMap() {
        Random rand = new Random(42);
        int key;
        for (int i = 0; i < 10; i++) {
            key = rand.nextInt(i + 20);
            map.put(key, Integer.toString(key));
        }
        System.out.println("Hash code order: " + map);
    }

    public void remap() {
        Set<Integer> keyset = map.keySet();
        Iterator<Integer> it;
        int temp;
        int smallest;
        int iterations = keyset.size();
        for (int i = 0; i < iterations; i++) {
            it = keyset.iterator();
            smallest = it.next();
            it = keyset.iterator();
            while (it.hasNext()) {
                temp = it.next();
                if (temp < smallest) smallest = temp;
            }
            linkedHashMap.put(smallest, map.get(smallest));
            keyset.remove(smallest);
        }
        System.out.println("Sorted (insertion order): " + linkedHashMap);
    }
}


//(3 points) Fill a HashMap with key-value pairs.
// Print the results to show ordering by hash code.
// Extract the pairs, sort by key, and place the result into a LinkedHashMap.
// Show that the insertion order is maintained.
// Repeat the previous example with a HashSet and LinkedHashSet.