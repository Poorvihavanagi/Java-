package com.xworkz.practice.runner;

import com.xworkz.practice.external.BCCI;
import com.xworkz.practice.internal.ICC;
import com.xworkz.practice.internal.IndianCricketTeamIccImpl;

public class ICCRunner {
    public static void main(String[] args) {
        ICC icc=new IndianCricketTeamIccImpl();
        BCCI bcci=new BCCI(icc);
        bcci.tournament();
    }
}
