package com.xworkz.brandNew;

import com.xworkz.internal.Newspaper;
import com.xworkz.internal.Notebook;

public class Workbook implements Newspaper, Notebook {

    @Override
    public void read() {
        System.out.println("Reading the newspaper.");
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing to the newspaper.");
    }

    @Override
    public void discard() {
        System.out.println("Discarding the old newspaper.");
    }

    @Override
    public void write() {
        System.out.println("Writing in the notebook.");
    }

    @Override
    public void flipPages() {
        System.out.println("Flipping the pages of the notebook.");
    }

    @Override
    public void tearPage() {
        System.out.println("Tearing a page from the notebook.");
    }
}
