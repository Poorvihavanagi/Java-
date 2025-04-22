package com.xworkz.practice.external;

import com.xworkz.practice.internal.Constitution;

public class Government {
    private Constitution constitution;

    public Government(Constitution constitution){
        this.constitution=constitution;
        System.out.println("Constitution in government");
    }
    public void conductElections(){
        if(this.constitution!=null){
            System.out.println("Constitution is not null");
            this.constitution.followLaws();
        }
        else{
            System.out.println("It is null");
        }
    }

}
