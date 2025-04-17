package com.xworkz.implement;

import com.xworkz.internal.Ladder;

public class StepLadder implements Ladder {
    public void extend() {
        System.out.println("Extending the step ladder to required height.");
    }

    public void climb() {
        System.out.println("Climbing up the step ladder carefully.");
    }

    public void fold() {
        System.out.println("Folding the step ladder for storage.");
    }
    @Override
    public void setHeight() {
        System.out.println("Adjusting the step ladder to the appropriate height.");
    }
}
