package com.demo.accessspecifiers;

public class Book
{
    public String title;
    int publicationYear;
    private String author;

    public Book(String title, int publicationYear, String author){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }

    public void open(){
        System.out.println("Running open in book");
        this.readPages();
    }

    void close(){
        System.out.println("Running close in book");
    }

    private void readPages(){
        System.out.println("Reading pages in book");
    }
}
