package com.xworkz.runner;

import com.xworkz.internal.Notebook;
import com.xworkz.implement.SpiralNotebook;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new SpiralNotebook();
        notebook.write();
        notebook.flipPages();
        notebook.tearPage();

        notebook.checkPageCount();
        notebook.displayCoverMaterial();
    }
}
