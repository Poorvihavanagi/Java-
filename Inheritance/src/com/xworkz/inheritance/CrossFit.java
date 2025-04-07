package com.xworkz.inheritance;

public class CrossFit extends Gym{
    public void doCardio(){
        System.out.println("Doing cardio exercises like running and cycling");
    }

    public void doDeadlift(Gym gym){
        gym.closeGym();
        gym.openGym();
        gym.conductTraining();
        gym.maintainHygiene();
        gym.provideEquipment();

        if(gym instanceof CrossFit){
            System.out.println("Gym is instance of cross fit");
            CrossFit crossFit=(CrossFit) gym;
            crossFit.doCardio();
        }
    }
}
