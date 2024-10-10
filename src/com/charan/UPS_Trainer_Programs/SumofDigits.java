package com.charan.UPS_Trainer_Programs;

import java.util.Scanner;

public class SumofDigits {

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int result = sumOfDigits(number);

        System.out.println("Sum of digits: " + result);
    }
}
