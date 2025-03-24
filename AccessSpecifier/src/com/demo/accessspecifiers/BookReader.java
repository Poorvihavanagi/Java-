package com.demo.accessspecifiers;

public class BookReader
{
    public static void main(String... args){
        Book book1 = new Book("Java Programming", 2023, "John Doe");


        System.out.println("Title: " +book1.title);
        System.out.println("Publication year: " +book1.publicationYear);
        //System.out.println("Book author: " +book1.author);
        book1.open();
        book1.close();
    }
}
