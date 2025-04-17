package com.xworkz.runner;

import com.xworkz.internal.Ladder;
import com.xworkz.implement.StepLadder;

public class LadderRunner {
    public static void main(String[] args) {
        Ladder ladder = new StepLadder();
        ladder.extend();
        ladder.climb();
        ladder.fold();
        ladder.setHeight();
    }
}
