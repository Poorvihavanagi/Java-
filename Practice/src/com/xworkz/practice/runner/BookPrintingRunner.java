package com.xworkz.practice.runner;

import com.xworkz.practice.external.PublishingHouse;
import com.xworkz.practice.internal.BookPrinting;
import com.xworkz.practice.internal.PenguinPrintImpl;

public class BookPrintingRunner {
    public static void main(String[] args) {
        BookPrinting bookPrinting=new PenguinPrintImpl();
        PublishingHouse publishingHouse=new PublishingHouse(bookPrinting);
        publishingHouse.publishBook();
    }
}
