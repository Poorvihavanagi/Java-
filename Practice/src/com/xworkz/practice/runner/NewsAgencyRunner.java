package com.xworkz.practice.runner;

import com.xworkz.practice.external.MediaHouse;
import com.xworkz.practice.internal.NewsAgency;
import com.xworkz.practice.internal.PressTrustOfIndiaImpl;

public class NewsAgencyRunner {
    public static void main(String[] args) {
        NewsAgency newsAgency=new PressTrustOfIndiaImpl();
        MediaHouse mediaHouse=new MediaHouse(newsAgency);
        mediaHouse.verifyNews();
    }
}
