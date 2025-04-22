package com.xworkz.practice.external;

import com.xworkz.practice.internal.BookPrinting;

public class PublishingHouse {
    private BookPrinting bookPrinting;

    public PublishingHouse(BookPrinting bookPrinting){
        this.bookPrinting=bookPrinting;
        System.out.println("Parameterized const");
    }

    public void publishBook(){
        if(this.bookPrinting!=null){
            System.out.println("Not null");
            this.bookPrinting.printEdition();
        }
        else{
            System.out.println("It is null");
        }
    }
}
