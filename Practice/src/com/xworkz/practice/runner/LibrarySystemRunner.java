package com.xworkz.practice.runner;

import com.xworkz.practice.external.LibraryApp;
import com.xworkz.practice.internal.LibrarySystem;
import com.xworkz.practice.internal.OverDriveLibraryImpl;

public class LibrarySystemRunner {
    public static void main(String[] args) {
        LibrarySystem librarySystem=new OverDriveLibraryImpl();
        LibraryApp libraryApp=new LibraryApp(librarySystem);
        libraryApp.returnBook();
    }
}
