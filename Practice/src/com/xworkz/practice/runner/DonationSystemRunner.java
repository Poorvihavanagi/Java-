package com.xworkz.practice.runner;

import com.xworkz.practice.external.CharityOrganization;
import com.xworkz.practice.internal.DonationSystem;
import com.xworkz.practice.internal.RedCrossDonationImpl;

public class DonationSystemRunner {
    public static void main(String[] args) {
        DonationSystem donationSystem=new RedCrossDonationImpl();
        CharityOrganization charityOrganization=new CharityOrganization(donationSystem);
        charityOrganization.thankDonors();
    }
}
