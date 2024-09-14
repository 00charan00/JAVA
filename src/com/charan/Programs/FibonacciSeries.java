package com.charan.Programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=-1,b=1,c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        System.out.println(c+"total");
    }
}
