package com.xworkz.inheritance;

public class HerbalShampoo extends Shampoo{
    public void preventDandruff() {
        System.out.println("Preventing dandruff and keeping the scalp clean...");
    }
    public void applyHerbs(Shampoo shampoo){
        shampoo.cleanse();
        shampoo.fragrance();
        shampoo.lather();
        shampoo.rinse();
        shampoo.nourish();
        if(shampoo instanceof HerbalShampoo){
            System.out.println("Shampoo is an instance of herbal shampoo");
            HerbalShampoo herbalShampoo=(HerbalShampoo) shampoo;
            herbalShampoo.preventDandruff();
        }


    }
}
