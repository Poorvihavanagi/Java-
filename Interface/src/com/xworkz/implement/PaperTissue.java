package com.xworkz.implement;

import com.xworkz.internal.Tissue;

public class PaperTissue implements Tissue {
    public void use() {
        System.out.println("Using the paper tissue.");
    }

    public void dispose() {
        System.out.println("Disposing of the used tissue.");
    }

    public void store() {
        System.out.println("Storing the tissue in a box.");
    }
}
