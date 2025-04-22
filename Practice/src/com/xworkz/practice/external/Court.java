package com.xworkz.practice.external;

import com.xworkz.practice.internal.Law;

public class Court {
    private Law law;
    public Court(Law law){
        this.law=law;
        System.out.println("Parametrized const");
    }

    public void hearCase(){
        if(this.law!=null){
            System.out.println("Law is not null");
            this.law.giveJudgement();
        }
        else{
            System.out.println("It is null");
        }
    }
}
