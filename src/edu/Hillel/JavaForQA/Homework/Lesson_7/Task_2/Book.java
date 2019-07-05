package edu.Hillel.JavaForQA.Homework.Lesson_7.Task_2;


public class Book {

    private String title;
    private Author authors;
    private int numberOfPages;

    public Book(String title, Author authors, int numberOfPages) {
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
