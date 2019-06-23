package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_3_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter the name of the file to open:");
        String fileName = "/Users/phubskii/IdeaProjects/Hillel_Home/src/edu/Hillel/JavaForQA/Homework/Lesson_6/Task_3_1/file.txt";

        BufferedReader reader;
        try {
            reader = openFile(fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            System.out.println(map(reader));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }


    private static BufferedReader openFile(String fileName) throws IOException {
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new IOException("File [name=" + fileName + "] not found.", e);
        }
    }

    private static List<DataObject> map(BufferedReader reader) throws IOException {

        List<DataObject> result = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            List<String> row = Arrays.asList(line.trim().split(","));
            DataObject dataObject = new DataObject();
            dataObject.setTitle(row.get(0));
            dataObject.setDeveloper(row.get(1));
            dataObject.setGenre(row.get(2));
            dataObject.setYear(row.get(3));
            dataObject.setPrice(row.get(4));


            result.add(dataObject);
        }

        return result;
    }



}


//(2 points) Write program that open a text file so that you can read the file
// one line at a time. Read each line as a String and place that String object
// into a LinkedList.
// Print all of the lines in the LinkedList in reverse order.