package com.xworkz.inheritance;

public class SoftToy extends Toy{
    public void dance(){
        System.out.println("Soft toy is dancing ");
    }

    public void wash(Toy toy){
        toy.play();
        toy.display();
        toy.clean();
        toy.repair();
        toy.pack();

        if(toy instanceof SoftToy){
            System.out.println("toy is an instance of soft toy");
            SoftToy softToy=(SoftToy) toy;
            softToy.dance();
        }
    }
}
