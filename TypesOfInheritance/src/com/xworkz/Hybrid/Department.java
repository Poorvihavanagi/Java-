package com.xworkz.Hybrid;

class Department extends Organization implements Auditable {
    public void audit() {
        System.out.println("Auditing department");
    }
}
