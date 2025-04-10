package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Casio", "LCD", "Solar");
        System.out.println(calculator);

        int hash = calculator.hashCode();
        System.out.println(new Calculator("Citizen", "LED", "Battery").hashCode());
    }
}