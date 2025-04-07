package com.xworkz.inheritance;

public class WaterTransport extends Boat{

    public void navigate(){
        System.out.println("navigate boat is water transport");
    }
    public void steer(Boat boat){
        if(boat instanceof WaterTransport){
            System.out.println("boat is an instance of water transport");
            WaterTransport waterTransport=(WaterTransport) boat;
            waterTransport.navigate();
        }
    }
}
