package com.charan.Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkArmstrong(n));
    }

    static Boolean checkArmstrong(int n) {
        int lastDigit;
        int original = n;
        int arm = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            lastDigit = n % 10;
            arm += Math.pow(lastDigit, digits);
            n = n / 10;
        }
        return arm == original;
    }
}
