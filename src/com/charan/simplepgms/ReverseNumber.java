package com.charan.simplepgms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
    static int reverse(int n){
        int ans=0;
        int LastDigit=0;
        while(n>0) {
            LastDigit = n % 10;
            ans=(ans*10)+LastDigit;
            n /= 10;
        }
        return ans;
    }
}
