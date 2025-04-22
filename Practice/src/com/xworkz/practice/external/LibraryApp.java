package com.xworkz.practice.external;

import com.xworkz.practice.internal.LibrarySystem;

public class LibraryApp {
    private LibrarySystem librarySystem;

    public LibraryApp(LibrarySystem librarySystem){
        this.librarySystem=librarySystem;
        System.out.println("Parameterized const");
    }

    public void returnBook(){
        if(this.librarySystem!=null){
            System.out.println("Not null");
            this.librarySystem.borrowBook();
        }
        else{
            System.out.println("It is null");
        }
    }
}
