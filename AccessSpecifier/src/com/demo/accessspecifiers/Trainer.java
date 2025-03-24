package com.demo.accessspecifiers;

public class Trainer
{
    Gym gym = new Gym();

    public void display(){
        gym.gymName="Cult fit";
        gym.location="Banglore";

        System.out.println("Trainer manages gym: " +gym.gymName);
        System.out.println("Location: " +gym.location);

        gym.workoutSession();
        gym.addMembers();
    }
}
