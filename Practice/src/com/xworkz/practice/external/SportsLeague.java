package com.xworkz.practice.external;

import com.xworkz.practice.internal.MatchScheduling;

public class SportsLeague {
    private MatchScheduling matchScheduling;

    public SportsLeague(MatchScheduling matchScheduling){
        this.matchScheduling=matchScheduling;
        System.out.println("Parameterized const");
    }
    public void schedulePlayoffs(){
        if(this.matchScheduling!=null){
            this.matchScheduling.scheduleGame();
            System.out.println("Not null matchScheduling");
        }
        else{
            System.out.println("It is null");
        }
    }
}
