package com.xworkz.runner;

import com.xworkz.internal.BagOfChips;
import com.xworkz.implement.PotatoChips;

public class BagOfChipsRunner {
    public static void main(String[] args) {
        BagOfChips chips = new PotatoChips();
        chips.openBag();
        chips.eatChips();
        chips.closeBag();

        chips.shakeBag();
        chips.resealBag();
    }
}
