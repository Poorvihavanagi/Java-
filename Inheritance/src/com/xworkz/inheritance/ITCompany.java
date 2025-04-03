package com.xworkz.inheritance;

public class ITCompany extends Company{
        public void hireEmployee() {
        super.hireEmployee();
        System.out.println("Running hire employee in IT company");
        }
        public void conductMeeting() {
            super.conductMeeting();
            System.out.println("Running conduct meeting in IT company");
        }
        public void developProduct() {
            super.developProduct();
            System.out.println("Running develop product in IT company");
        }
        public void provideService() {
            super.provideService();
            System.out.println("Running provide service in IT company");
        }

        public void generateRevenue() {
            super.generateRevenue();
            System.out.println("Running generate revenue in IT company");
        }

}
