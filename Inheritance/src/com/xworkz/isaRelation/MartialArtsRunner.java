package com.xworkz.isaRelation;

import com.xworkz.inheritance.Karate;
import com.xworkz.inheritance.MartialArts;
import com.xworkz.inheritance.Skill;

public class MartialArtsRunner {
    public static void main(String[] args) {
        Skill skill = new Skill();
        skill.practice();
        skill.spar();
        skill.performKata();
        skill.increaseStamina();
        skill.learnDiscipline();

        System.out.println("--------------------------------------");
        MartialArts martialArts = new Skill();
        martialArts.practice();
        martialArts.spar();
        martialArts.performKata();
        martialArts.increaseStamina();
        martialArts.learnDiscipline();

        System.out.println("--------------------------------------");
        Karate karate=new Karate();
        karate.performPunch(karate);
        karate.performPunch(martialArts);
    }
}
