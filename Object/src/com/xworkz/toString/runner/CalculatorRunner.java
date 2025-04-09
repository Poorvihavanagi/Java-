package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Casio", "LCD", "Solar");
        System.out.println(calculator);
    }
}