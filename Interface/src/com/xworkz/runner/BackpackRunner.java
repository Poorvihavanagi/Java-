package com.xworkz.runner;

import com.xworkz.implement.WildcraftBag;
import com.xworkz.internal.Backpack;

public class BackpackRunner {
    public static void main(String[] args) {
        Backpack backpack=new WildcraftBag();
        backpack.openZip();
        backpack.storeItems();
        backpack.carry();

        backpack.clean();
        backpack.adjustStraps();
    }
}
