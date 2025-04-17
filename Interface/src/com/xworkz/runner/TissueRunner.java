package com.xworkz.runner;

import com.xworkz.internal.Tissue;
import com.xworkz.implement.PaperTissue;

public class TissueRunner {
    public static void main(String[] args) {
        Tissue tissue = new PaperTissue();
        tissue.use();
        tissue.dispose();
        tissue.store();

        tissue.pack();
        tissue.recycle();
    }
}
