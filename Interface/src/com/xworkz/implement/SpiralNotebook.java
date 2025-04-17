package com.xworkz.implement;

import com.xworkz.internal.Notebook;

public class SpiralNotebook implements Notebook {
    public void write() {
        System.out.println("Writing notes in the spiral notebook.");
    }

    public void flipPages() {
        System.out.println("Flipping through the spiral notebook pages.");
    }

    public void tearPage() {
        System.out.println("Tearing a page from the spiral notebook.");
    }
    @Override
    public void checkPageCount() {
        System.out.println("Checking the page count in the spiral notebook.");
    }

    @Override
    public void displayCoverMaterial() {
        System.out.println("The cover of this spiral notebook is made of cardboard.");
    }
}
