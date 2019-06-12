package edu.Hillel.JavaForQA.Homework.Lesson_5.Task_2_2;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Mouse> mouseArrayList = new ArrayList<Mouse>();
        for (int i=0; i<5; i++){
            mouseArrayList.add(new Mouse());
        }
        for (int i=0; i<5; i++){
            (mouseArrayList.get(i)).hop();
        }
    }

}
