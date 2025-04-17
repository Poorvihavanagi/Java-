package com.xworkz.copies;

import com.xworkz.internal.Book;
import com.xworkz.internal.Pen;
import com.xworkz.brandNew.ReadingAndWriting;

public class ReadingAndWritingRunner {
    public static void main(String[] args) {
        Book book = new ReadingAndWriting();
        book.read();
        book.close();
        book.bookmark();

        System.out.println("------------------------------");

        Pen pen = new ReadingAndWriting();
        pen.write();
        pen.refill();
        pen.click();
    }
}
