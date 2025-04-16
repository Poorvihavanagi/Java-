package com.xworkz.brandNew;

import com.xworkz.internal.Book;
import com.xworkz.internal.Pen;

public class ReadingAndWriting implements Book, Pen {

    @Override
    public void read() {
        System.out.println("Reading the book.");
    }

    @Override
    public void close() {
        System.out.println("Closing the book.");
    }

    @Override
    public void bookmark() {
        System.out.println("Bookmarking the page.");
    }

    @Override
    public void write() {
        System.out.println("Writing with the pen.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the pen.");
    }

    @Override
    public void click() {
        System.out.println("Clicking the pen.");
    }
}
