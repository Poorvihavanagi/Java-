package com.xworkz.runner;

import com.xworkz.implement.Novel;
import com.xworkz.internal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new Novel();
        book.read();
        book.close();
        book.bookmark();

    }

}
