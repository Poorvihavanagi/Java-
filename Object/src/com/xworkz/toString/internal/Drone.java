package com.xworkz.toString.internal;

public class Drone {

        private String model;
        private int flightTime;
        private String cameraQuality;

        public Drone(String model, int flightTime, String cameraQuality) {
            this.model = model;
            this.flightTime = flightTime;
            this.cameraQuality = cameraQuality;
        }
        @Override
        public String toString() {
            return "Drone{Model='" + model + "', Flight Time=" + flightTime + " mins, Camera='" + cameraQuality + "'}";
        }
        @Override
        public int hashCode(){
            System.out.println("Default hash code: " + super.hashCode());
            return -200;
        }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Drone) {
                System.out.println("Ref is Drone, will compare...");
                Drone drone1 = this;
                Drone drone2 = (Drone) obj;
                if (drone1.model.equals(drone2.model) && drone1.flightTime == drone2.flightTime) {
                    System.out.println("Both Drones have the same model and flight time");
                    return true;
                }
            }
        }
        return false;
    }
}
