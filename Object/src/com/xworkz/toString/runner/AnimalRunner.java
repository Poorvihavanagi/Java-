package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Animal;

public class AnimalRunner
{
    public static void main(String[] args) {
        Animal animal=new Animal("Leo", "Lion", 5);
        System.out.println(animal);

        int code=animal.hashCode();
        System.out.println("Code: " +code);

        System.out.println(new Animal("Leo","Tiger",10).hashCode());

        Animal animal1 = new Animal("Leo", "Lion", 5);
        Animal animal2 = new Animal("Simba", "Lion", 6);

        System.out.println("Checking same location: " + (animal1 == animal2));
        boolean same = animal2.equals(animal1);
        System.out.println("Animal1 is same as Animal2: " + same);
    }
}
