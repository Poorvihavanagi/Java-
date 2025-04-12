package com.xworkz.toString.internal;

public class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{Name: " + name + ", Species: " + species + ", Age: " + age + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default code: " +super.hashCode());
        return 10;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Animal) {
                System.out.println("Ref is Animal, will compare...");
                Animal animal1 = this;
                Animal animal2 = (Animal) obj;
                if (animal1.name.equals(animal2.name)) {
                    System.out.println("Both animals have the same name");
                    return true;
                }
            }
        }
        return false;
    }
}
