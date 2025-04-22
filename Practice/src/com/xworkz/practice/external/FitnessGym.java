package com.xworkz.practice.external;

import com.xworkz.practice.internal.ExerciseMonitor;

public class FitnessGym {
    private ExerciseMonitor exerciseMonitor;

    public FitnessGym(ExerciseMonitor exerciseMonitor){
        this.exerciseMonitor=exerciseMonitor;
        System.out.println("Paramterized const fitness gym");
    }

    public void scheduleClass(){
        if(this.exerciseMonitor!=null){
            this.exerciseMonitor.trackWorkout();
            System.out.println("Exercise monitor not null");
        }
        else{
            System.out.println("It is null");
        }
    }
}
