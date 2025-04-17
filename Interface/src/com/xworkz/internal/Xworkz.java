package com.xworkz.internal;

public interface Xworkz {
    void conductTraining();
    void providePlacement();
    void buildCareers();

    default void giveCertificates() {
        System.out.println("Giving certificates to students.");
    }
}
