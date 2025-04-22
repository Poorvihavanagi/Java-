package com.xworkz.practice.external;

import com.xworkz.practice.internal.DonationSystem;

public class CharityOrganization {
    private DonationSystem donationSystem;

    public CharityOrganization (DonationSystem donationSystem){
        this.donationSystem=donationSystem;
        System.out.println("Parameterized const");
    }
    public void thankDonors(){
        if(this.donationSystem!=null){
            this.donationSystem.processDonation();
            System.out.println("Not null");
        }
        else{
            System.out.println("It is null");
        }
    }
}
