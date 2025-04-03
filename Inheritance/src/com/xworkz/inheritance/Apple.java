package com.xworkz.inheritance;

public class Apple extends Fruit {
    public void grow() { super.grow(); System.out.println("Growing apples in an orchard..."); }
    public void ripen() { super.ripen(); System.out.println("Ripening apples to a red color..."); }
    public void harvest() { super.harvest(); System.out.println("Harvesting apples from trees..."); }
    public void wash() { super.wash(); System.out.println("Washing apples with clean water..."); }
    public void eat() { super.eat(); System.out.println("Eating a juicy apple..."); }
}
