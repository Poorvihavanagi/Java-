package com.xworkz.practice.runner;

import com.xworkz.practice.external.FitnessApp;
import com.xworkz.practice.internal.HealthTracker;
import com.xworkz.practice.internal.MyFitnessPalImpl;

public class HealthTrackerRunner {
    public static void main(String[] args) {
        HealthTracker healthTracker=new MyFitnessPalImpl();
        FitnessApp fitnessApp=new FitnessApp(healthTracker);
        fitnessApp.trackCalories();
    }
}
