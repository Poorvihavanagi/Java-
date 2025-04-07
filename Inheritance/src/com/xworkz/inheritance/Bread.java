package com.xworkz.inheritance;

public class Bread extends Baked{

    public void slice(Baked baked){
        baked.prepare();
        baked.bake();
        baked.coolDown();
        baked.pack();
        baked.serve();

        if (baked instanceof Bread) {
            System.out.println("Baked item is a instance of Bread");
            Cookie cookie=(Cookie) baked;
            cookie.slice();
        }
    }
}
