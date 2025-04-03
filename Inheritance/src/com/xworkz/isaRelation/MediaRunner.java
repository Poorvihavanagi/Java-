package com.xworkz.isaRelation;

import com.xworkz.inheritance.Media;
import com.xworkz.inheritance.Newspaper;

public class MediaRunner
{
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        newspaper.print();
        newspaper.broadcast();
        newspaper.edit();
        newspaper.publish();
        newspaper.distribute();
        System.out.println("------------------------------------------------------------------------");
        Media media = new Newspaper();
        media.print();
        media.broadcast();
        media.edit();
        media.publish();
        media.distribute();
    }
}
