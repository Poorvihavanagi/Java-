package com.xworkz.inheritance;

public class Fitness extends Gym {

    @Override
    public void openGym() {
        super.openGym();
        System.out.println("Running openGym in fitness");
    }

    @Override
    public void closeGym() {
        super.closeGym();
        System.out.println("Running closeGym in fitness");
    }

    @Override
    public void provideEquipment() {
        super.provideEquipment();
        System.out.println("Running provideEquipment in fitness");
    }

    @Override
    public void conductTraining() {
        super.conductTraining();
        System.out.println("Running conductTraining in fitness");
    }

    @Override
    public void maintainHygiene() {
        super.maintainHygiene();
        System.out.println("Running maintainHygiene in fitness");
    }
}
