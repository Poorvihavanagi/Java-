package com.xworkz.implement;

import com.xworkz.internal.Book;

public class Novel implements Book {
    @Override
    public void read() {
        System.out.println("Reading the novel.");
    }

    @Override
    public void close() {
        System.out.println("Closing the novel.");
    }

    @Override
    public void bookmark() {
        System.out.println("Bookmarking the page in the novel.");
    }
    @Override
    public void highlightText() {
        System.out.println("Highlighting important passages in the novel.");
    }

    @Override
    public void addNotes() {
        System.out.println("Adding notes in the margins of the novel.");
    }
}
