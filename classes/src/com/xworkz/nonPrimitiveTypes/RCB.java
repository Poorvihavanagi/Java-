package com.xworkz.nonPrimitiveTypes;

public class RCB
{
    void match(Player player){
        if(player!=null){
            System.out.println("Player running in RCB");
            player.play();
        }
        else{
            System.out.println("Not running player in RCB");
        }
    }
}
