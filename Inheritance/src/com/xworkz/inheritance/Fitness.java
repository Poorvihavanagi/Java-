package com.xworkz.inheritance;

public class Fitness extends Gym
{

    public void openGym() {
        super.openGym();
        System.out.println("Fitness Center is open 24/7 for premium member");
    }
    public void closeGym() {
        super.closeGym();
        System.out.println("Fitness Center closes at 10 PM for regular member");
    }
    public void provideEquipment() {
        super.provideEquipment();
        System.out.println("Fitness Center provides advanced gym equipment");
    }

    public void conductTraining() {
        super.conductTraining();
        System.out.println("Fitness Center offers yoga");
    }
    public void maintainHygiene() {
        super.maintainHygiene();
        System.out.println("Fitness Center ensures sanitized gym spaces");
    }
}
