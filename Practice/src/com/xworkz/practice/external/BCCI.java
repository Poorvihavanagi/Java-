package com.xworkz.practice.external;

import com.xworkz.practice.internal.ICC;

public class BCCI {
    private ICC icc;

    public BCCI(ICC icc){
        this.icc=icc;
        System.out.println("Parameterized constructor");
    }
    public void tournament(){
        System.out.println("Running tournament in BCCI");
        if(this.icc!=null){
            this.icc.fairPlay();
        }
        else{
            System.out.println("It is null");
        }
    }
}
