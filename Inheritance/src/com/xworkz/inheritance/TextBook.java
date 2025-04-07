package com.xworkz.inheritance;

public class TextBook extends Book{
    public void summarize(){
        System.out.println("Summarizing the key points in the material");
    }

    public void subject(Book book){
        book.bookmark();
        book.close();
        book.checkPages();
        book.open();
        book.read();
        if(book instanceof TextBook){
            System.out.println("book is instance of textbook");
            TextBook textBook=(TextBook) book;
            textBook.summarize();
        }
    }
}
