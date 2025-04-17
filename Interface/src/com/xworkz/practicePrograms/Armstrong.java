package com.xworkz.practicePrograms;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, originalNum, remainder, result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        num = scanner.nextInt();

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += remainder * remainder * remainder;
            originalNum /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
