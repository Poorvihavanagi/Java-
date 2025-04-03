
package com.xworkz.isaRelation;

import com.xworkz.inheritance.Chips;
import com.xworkz.inheritance.Snack;

public class SnackRunner {
    public static void main(String[] args) {
        Chips chips = new Chips();
        chips.prepare();
        chips.pack();
        chips.open();
        chips.eat();
        chips.enjoy();

        System.out.println("-----------------------------------------------------");

        Snack snack = new Chips();
        snack.prepare();
        snack.pack();
        snack.open();
        snack.eat();
        snack.enjoy();
    }
}
