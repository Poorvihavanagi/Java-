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
}
