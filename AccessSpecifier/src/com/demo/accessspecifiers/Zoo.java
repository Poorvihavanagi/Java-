package com.demo.accessspecifiers;

public class Zoo
{
    public String name;
    String location;
    private int animalCount;

    public void addAnimal(){
        this.animalCount=30;
        System.out.println("Animals in the zoo");
    }

    void openZoo(){
        this.manageZoo();
        System.out.println("The zoo is open now");
    }

    private void manageZoo(){
        System.out.println("Managaing zoo");
    }
}
