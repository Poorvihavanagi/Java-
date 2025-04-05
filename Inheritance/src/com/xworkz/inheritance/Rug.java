package com.xworkz.inheritance;

public class Rug extends Mat {

    public void place() {
        super.place();
        System.out.println("Running place in Rug");
    }

    public void clean() {
        super.clean();
        System.out.println("Running clean in Rug");
    }

    public void rollUp() {
        super.rollUp();
        System.out.println("Running rollUp in Rug");
    }

    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running checkMaterial in Rug");
    }

    public void move() {
        super.move();
        System.out.println("Running move in Rug");
    }
}
