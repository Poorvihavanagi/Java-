package com.xworkz.runner;

import com.xworkz.implement.RunningShoe;
import com.xworkz.internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe=new RunningShoe();
        shoe.wear();
        shoe.tieLaces();
        shoe.remove();

        shoe.clean();
        shoe.polish();
    }
}
