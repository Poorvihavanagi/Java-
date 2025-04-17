package com.xworkz.runner;

import com.xworkz.internal.Claypot;
import com.xworkz.implement.TraditionalClaypot;

public class ClaypotRunner {
    public static void main(String[] args) {
        Claypot claypot = new TraditionalClaypot();
        claypot.heatUp();
        claypot.cook();
        claypot.coolDown();
        claypot.clean();
        claypot.store();
    }
}
