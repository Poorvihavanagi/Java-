package com.xworkz.isaRelation;

import com.xworkz.inheritance.Book;
import com.xworkz.inheritance.Material;

public class BookRunner
{
    public static void main(String[] args) {
        Material material = new Material();
        material.open();
        material.read();
        material.close();
        material.bookmark();
        material.checkPages();

        System.out.println("---------------------------------");

        Book book = new Material();
        book.open();
        book.read();
        book.close();
        book.bookmark();
        book.checkPages();
    }
}
