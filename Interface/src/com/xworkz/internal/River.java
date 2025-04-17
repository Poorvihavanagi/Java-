package com.xworkz.internal;

public interface River {
    void flow();
    void provideWater();
    void supportEcosystem();
    default void flood() {
        System.out.println("The river is flooding due to heavy rainfall.");
    }

    default void dryUp() {
        System.out.println("The river is drying up due to lack of rainfall.");
    }
}
