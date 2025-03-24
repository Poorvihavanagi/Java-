package com.demo.accessspecifiers.example;

import com.demo.accessspecifiers.Book;

public class BookRunner
{
    public static void main(String... args) {

        Book book1 = new Book("Effective Java", 2022, "Joshua Bloch");


        System.out.println("Title: " + book1.title);
        book1.open();
        //book1.close();
        //book1.readPages();
    }
}
