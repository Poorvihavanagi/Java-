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
    }
}
