package com.xworkz.inheritance;

public class Resume extends Document{
    public void addCharts(){
        System.out.println("Adding charts to the report");
    }
    public void addPersonalDetails(Document document){
        document.viewing();;
        document.type();
        document.delete();
        document.draw();
        document.edit();

        if(document instanceof Resume){
            System.out.println("Document is instance of resume");
            Resume resume=(Resume) document;
            resume.addCharts();
        }
    }
}
