package com.xworkz.practice.internal;

public class OverDriveLibraryImpl implements LibrarySystem{
    @Override
    public void borrowBook() {
        System.out.println("Running borrow book in drive library");
    }
}
