package com.xworkz.practice.runner;

import com.xworkz.practice.external.Court;
import com.xworkz.practice.internal.Law;
import com.xworkz.practice.internal.SupremeCourtLawImpl;

public class LawRunner {
    public static void main(String[] args) {
        Law law=new SupremeCourtLawImpl();
        Court court=new Court(law);
        court.hearCase();
    }
}
