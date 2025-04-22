package com.xworkz.practice.runner;

import com.xworkz.practice.external.FitnessGym;
import com.xworkz.practice.internal.ExerciseMonitor;
import com.xworkz.practice.internal.GymFitnessImpl;

public class ExerciseMonitorRunner {
    public static void main(String[] args) {
        ExerciseMonitor exerciseMonitor=new GymFitnessImpl();
        FitnessGym fitnessGym=new FitnessGym(exerciseMonitor);
        fitnessGym.scheduleClass();
    }
}
