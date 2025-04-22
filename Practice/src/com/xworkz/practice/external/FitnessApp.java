package com.xworkz.practice.external;

import com.xworkz.practice.internal.HealthTracker;

public class FitnessApp {
    private HealthTracker healthTracker;

    public FitnessApp(HealthTracker healthTracker){
        this.healthTracker=healthTracker;
        System.out.println("Parameterized const in healthtracker");
    }
    public void trackCalories(){
        if(this.healthTracker!=null){
            System.out.println("Fitness App is not null");
            this.healthTracker.logWorkout();
        }
        else{
            System.out.println("It is null");
        }
    }
}
