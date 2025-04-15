package com.xworkz.Hybrid;

class OnlineCourse extends Course implements Certifiable {
    public void getCertificate() {
        System.out.println("Certificate received");
    }
}