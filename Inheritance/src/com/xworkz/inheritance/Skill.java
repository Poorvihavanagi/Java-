package com.xworkz.inheritance;

public class Skill extends MartialArts {

    @Override
    public void practice() {
        super.practice();
        System.out.println("Running practice in skill");
    }

    @Override
    public void spar() {
        super.spar();
        System.out.println("Running spar in skill");
    }

    @Override
    public void performKata() {
        super.performKata();
        System.out.println("Running perform kata in skill");
    }

    @Override
    public void increaseStamina() {
        super.increaseStamina();
        System.out.println("Running increase stamina in skill");
    }

    @Override
    public void learnDiscipline() {
        super.learnDiscipline();
        System.out.println("Running learn discipline in skill");
    }
    public void practiceKicks() {
        System.out.println("Practicing various kicking techniques");
    }
}
