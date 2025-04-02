package com.xworkz.isaRelation;

import com.xworkz.inheritance.Document;
import com.xworkz.inheritance.Report;

public class Runner
{
    public static void main(String... args){

        Report report=new Report();
        report.edit();
        report.draw();
        report.type();
        report.delete();
        report.viewing();

        Document document=new Report();
        document.edit();
        document.draw();
        document.type();
        document.delete();
        document.viewing();


    }
}
