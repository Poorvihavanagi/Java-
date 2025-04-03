package com.xworkz.inheritance;

public class Metro extends Transportation{

        public void move() {
            super.move();
            System.out.println("Running move metro");
        }

        public void stop() {
            super.stop();
            System.out.println("Running stop metro");
        }

        public void fuel() {
            super.fuel();
            System.out.println("Running fuel metro");
        }

        public void capacity() {
            super.capacity();
            System.out.println("Running capacity metro");
        }

        public void speed() {
            super.speed();
            System.out.println("Running speed metro");
        }
}
