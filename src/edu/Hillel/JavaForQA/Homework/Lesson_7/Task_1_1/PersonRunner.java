package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_1_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRunner {

    public static void main(String[] args) {

        Person person1 = new Person("Smith", 24);
        Person person2 = new Person("Jhon", 66);
        Person person3 = new Person("Bill", 43);
        Person person4 = new Person("Ron", 19);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);


        List<Person> sortedByAge = persons.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        sortedByAge.forEach(e -> System.out.println(e));

        System.out.println("---------------------------");

        List<Person> sortedByName = persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        sortedByName.forEach(e -> System.out.println(e));

    }


}

//(2 points) Create:
// - a Person class with name and age fields;
// - an array of Persons;
// - two instances of Comparator<Person> interface using lambda expressions:
// first one for comparing by name, second one – by age;

// - Then sort them using these comparators;
// - Use forEach method for printing information about all the persons. Use the method reference;


