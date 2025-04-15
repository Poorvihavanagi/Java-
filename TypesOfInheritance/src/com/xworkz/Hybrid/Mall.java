package com.xworkz.Hybrid;

class Mall extends Building implements Accessible {
    public void provideAccess() {
        System.out.println("Mall is accessible to public");
    }
}