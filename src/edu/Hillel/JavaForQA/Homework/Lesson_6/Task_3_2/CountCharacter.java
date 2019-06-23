package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_3_2;

import edu.Hillel.JavaForQA.Homework.Lesson_6.Task_3_1.DataObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CountCharacter {

    public static void main(String[] args) throws IOException {

        Path myFile = Paths.get("/Users/phubskii/IdeaProjects/Hillel_Home/src/edu/Hillel/JavaForQA/Homework/Lesson_6/Task_3_2/file2.txt");

        System.out.println("The amount of character is = " + countCharacter(myFile, 'e'));

    }

    public static long countCharacter(Path path, char lookFor) throws IOException {

        try (Stream<String> stream = Files.lines(path)) {

            return stream.flatMapToInt(String::chars)
                    .filter(c -> c == (int) lookFor)
                    .count();
        }
    }
}

//(3 point) Write program that counts the number of times a particular character,
// such as e, appears in a file. The character can be specified at the command line.
// Use next text as example of txt file

//To be, or not to be: that is the question:
//Whether 'tis nobler in the mind to suffer
//The slings and arrows of outrageous fortune,
//Or to take arms against a sea of troubles,
//And by opposing end them? To die: to sleep;
//No more; and by a sleep to say we end
//The heart-ache and the thousand natural shocks
//That flesh is heir to, 'tis a consummation
