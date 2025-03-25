package com.xworkz.accessorsAndMutators;

public class AlienType
{
    public void alienProcess(Alien alien){
        System.out.println("Alien info.....");
        System.out.println("Seen by: " +alien.getSeenBy());
        System.out.println("Seen Date: " +alien.getSeenDate());
        System.out.println("Description: " +alien.getDescribe());
    }

    public void initAlienProcess(){
        Alien alien = new Alien();
        alien.setSeenBy("Astronomer John Doe");
        alien.setSeenDate("25/03/2025");
        alien.setDescribe("Tall, green-skinned creature with glowing eyes, seen hovering near a spacecraft");

        alienProcess(alien);
    }
}
