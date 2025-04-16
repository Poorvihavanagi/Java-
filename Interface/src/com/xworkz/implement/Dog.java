package com.xworkz.implement;

import com.xworkz.internal.Animal;

public class Dog implements Animal {
    @Override
    public void sound(){
        System.out.println("Running sound in dog");
    }
    @Override
    public void eat(){
        System.out.println("Running eat in dog");
    }
    @Override
    public void sleep(){
        System.out.println("Running sleep in dog");
    }
}
