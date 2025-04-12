package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Casio", "LCD", "Solar");
        System.out.println(calculator);

        int hash = calculator.hashCode();
        System.out.println(new Calculator("Citizen", "LED", "Battery").hashCode());

        Calculator calc1 = new Calculator("Casio", "LCD", "Solar");
        Calculator calc2 = new Calculator("Citizen", "LED", "Battery");

        System.out.println("Checking same location: " + (calc1 == calc2));
        boolean same = calc2.equals(calc1);
        System.out.println("Calculator1 is same as Calculator2: " + same);

    }

}