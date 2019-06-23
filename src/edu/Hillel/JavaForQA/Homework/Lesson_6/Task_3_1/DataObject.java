package edu.Hillel.JavaForQA.Homework.Lesson_6.Task_3_1;

 public class DataObject {

    private  String title;
    private  String developer;
    private  String genre;
    private  String year;
    private  String price;


     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getDeveloper() {
         return developer;
     }

     public void setDeveloper(String developer) {
         this.developer = developer;
     }

     public String getGenre() {
         return genre;
     }

     public void setGenre(String genre) {
         this.genre = genre;
     }

     public String getYear() {
         return year;
     }

     public void setYear(String year) {
         this.year = year;
     }

     public String getPrice() {
         return price;
     }

     public void setPrice(String price) {
         this.price = price;
     }

     @Override
     public String toString() {
         return "DataObject{" +
                 "title='" + title + '\'' +
                 ", developer='" + developer + '\'' +
                 ", genre='" + genre + '\'' +
                 ", year=" + year +
                 ", price=" + price +
                 '}';
     }
 }

