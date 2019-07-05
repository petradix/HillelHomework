package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {

    public static void main(String[] args) {

        Author petro = new Author("Petro", 20);

        Book petroBook1 = new Book("petroBook1", petro, 1000);
        Book petroBook2 = new Book("petroBook2", petro, 500);
        Book petroBook3 = new Book("petroBook3", petro, 150);

        petro.getBooks().add(petroBook1);
        petro.getBooks().add(petroBook2);
        petro.getBooks().add(petroBook3);

        Author alex = new Author("Alex", 18);

        Book alexBook1 = new Book("alexBook1", alex, 900);
        Book alexBook2 = new Book("alexBook2", alex, 700);
        Book alexBook3 = new Book("alexBook3", alex, 300);

        alex.getBooks().addAll(Arrays.asList(alexBook1, alexBook2, alexBook3));

        List<Author> authors = Arrays.asList(petro, alex);

        List<Book> books = Stream.concat(petro.getBooks().stream(), alex.getBooks().stream()).collect(Collectors.toList());


        System.out.println("===== check if some/all book(s) have more than 200 pages =====");
        books.stream()
                .filter(e -> e.getNumberOfPages() > 200).forEach(e -> System.out.println(e));


        System.out.println("\n===== find the books with max and min number of pages =====");
        System.out.println(books.stream()
                .max(Comparator.comparing(e -> e.getNumberOfPages()))
                .get());

        System.out.println(books.stream()
                .min(Comparator.comparing(e -> e.getNumberOfPages()))
                .get());


        System.out.println("\n===== sort the books by number of pages/title =====");
        books.stream()
                .sorted(Comparator.comparing(e -> e.getNumberOfPages()))
                .forEach(e -> System.out.println(e));

        books.stream()
                .sorted(Comparator.comparing(e -> e.getTitle()))
                .forEach(e -> System.out.println(e));


        System.out.println("\n===== get list of all titles + print them using forEach method =====");
        books.stream()
                .map(e -> e.getTitle())
                .collect(Collectors.toList())
                .forEach(e -> System.out.println(e));

        System.out.println("\n===== get distinct list of all authors +  Use parallel stream with subtask #3 =====");
        authors.stream()
                .parallel()
                .distinct()
                .collect(Collectors.toList())
                .forEach(e -> System.out.println(e));


    }
}
