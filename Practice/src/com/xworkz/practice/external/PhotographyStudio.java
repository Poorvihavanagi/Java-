package com.xworkz.practice.external;

import com.xworkz.practice.internal.PhotographyService;

public class PhotographyStudio {
    private PhotographyService photographyService;

    public PhotographyStudio(PhotographyService photographyService){
        this.photographyService=photographyService;
        System.out.println("Parametrized const photograohy service");
    }

    public void editPhotos(){
        if(this.photographyService!=null){
            this.photographyService.scheduleShoot();
            System.out.println("Not null photographyService");
        }
        else{
            System.out.println("It is null");
        }
    }
}
