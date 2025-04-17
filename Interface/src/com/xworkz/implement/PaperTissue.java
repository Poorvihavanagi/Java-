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
    @Override
    public void pack() {
        System.out.println("Packing the paper tissue in a box.");
    }

    @Override
    public void recycle() {
        System.out.println("Recycling the used paper tissue.");
    }
}
