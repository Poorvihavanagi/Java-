package com.xworkz.isaRelation;

import com.xworkz.inheritance.CrossFit;
import com.xworkz.inheritance.Gym;
import com.xworkz.inheritance.Fitness;

public class FitnessRunner {
    public static void main(String[] args) {

        Fitness fitness = new Fitness();
        fitness.openGym();
        fitness.closeGym();
        fitness.provideEquipment();
        fitness.conductTraining();
        fitness.maintainHygiene();

        System.out.println("---------------------------------------------");
        Gym gym = new Fitness();
        gym.openGym();
        gym.closeGym();
        gym.provideEquipment();
        gym.conductTraining();
        gym.maintainHygiene();

        System.out.println("---------------------------------------------");
        CrossFit crossFit=new CrossFit();
        crossFit.doDeadlift(crossFit);
        crossFit.doDeadlift(gym);
    }
}
