package com.xworkz.inheritance;

public class Peacock extends Bird{

    public void layEggs(){
        System.out.println("Peacock lay eggs");
    }
    public void preenFeathers(Bird bird){
        bird.fly();
        bird.sing();
        bird.eat();
        bird.sleep();
        bird.buildNest();

        if(bird instanceof Peacock){
            System.out.println("Bird is an instance of peacock");
            Peacock peacock=(Peacock) bird;
            peacock.layEggs();
        }
    }
}
