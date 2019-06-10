package edu.Hillel.JavaForQA.Homework.Lesson_5.Temp;

import java.util.*;

public class Temp_4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,10,4,6,4,4,6,6,66));
        System.out.println(list);

        List<Integer> newList = removeDuplicates(list);
        System.out.println(newList);

        List<Integer> newList1 = removeDuplicatesWithSet(list);
        System.out.println(newList);

    }

    private static List<Integer> removeDuplicatesWithSet(List<Integer> bufferedList) {
        Set<Integer> buferSet = new HashSet<>();
        buferSet.addAll(bufferedList);
        bufferedList.clear();
        bufferedList.addAll(buferSet);
        return bufferedList;
    }

    private static List<Integer> removeDuplicates(List<Integer> durtyList) {
        List<Integer> bufferList = new ArrayList<>();
        for (Integer element : durtyList){
            if (!bufferList.contains(element)){
                bufferList.add(element);
            }
        }
        return bufferList;
    }
}
