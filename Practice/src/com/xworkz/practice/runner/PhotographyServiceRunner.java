package com.xworkz.practice.runner;

import com.xworkz.practice.external.PhotographyStudio;
import com.xworkz.practice.internal.PhotographyService;
import com.xworkz.practice.internal.ShutterbugStudioImpl;

public class PhotographyServiceRunner {
    public static void main(String[] args) {
        PhotographyService photographyService=new ShutterbugStudioImpl();
        PhotographyStudio photographyStudio=new PhotographyStudio(photographyService);
        photographyStudio.editPhotos();
    }
}
