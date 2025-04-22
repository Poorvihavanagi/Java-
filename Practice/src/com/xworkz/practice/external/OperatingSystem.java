package com.xworkz.practice.external;

import com.xworkz.practice.internal.Laptop;

public class OperatingSystem {
    private Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Laptop in operating system");
    }
    public void boot(){
        if(this.laptop!=null){
            System.out.println("Laptop is not null");
            this.laptop.process();
        }
        else{
            System.out.println("It is null");
        }
    }
}
