package edu.Hillel.JavaForQA.Homework.Lesson_6.Temp_6;

import java.io.*;

public class Temp_6_1 {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        int b = 0;


        try {
            fileInputStream = new FileInputStream("/Users/phubskii/Documents/TestL5.txt");
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            while ((b = inputStreamReader.read()) != -1) {
                System.out.println((char) b);
            }

        } catch (IOException exception) {
            exception.printStackTrace();

        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}






