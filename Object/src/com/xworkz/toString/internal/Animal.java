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
}
