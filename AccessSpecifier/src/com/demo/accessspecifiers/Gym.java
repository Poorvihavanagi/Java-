package com.demo.accessspecifiers;

public class Gym
{
    public String gymName;
    String location;
    private int members;

    public void addMembers(){
        this.members=50;
        System.out.println("Number of members in gym: " +this.members);
    }

    void workoutSession(){
        this.maintainEquipment();
        System.out.println("Workout session in gym");
    }

    private void maintainEquipment(){
        System.out.println("Maintaining gym equipment...");
    }

}
