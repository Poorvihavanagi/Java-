package com.xworkz.brandNew;
import com.xworkz.internal.Tissue;
import com.xworkz.internal.Comb;
public class Accessory implements Comb,Tissue{

    public void untangleHair() {
        System.out.println("Using the comb to untangle hair.");
    }

    public void cleanComb() {
        System.out.println("Cleaning the comb after use.");
    }

    public void keepInDrawer() {
        System.out.println("Keeping the comb in the drawer.");
    }
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
