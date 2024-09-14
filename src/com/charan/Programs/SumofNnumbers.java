package com.charan.Programs;

import java.util.Scanner;

public class SumofNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int n=sc.nextInt();
            int sum=0;
            for(int j=0;j<n;j++){
                sum+= sc.nextInt();
            }
            System.out.println("The answer for test case "+i+"="+sum);
        }
    }
}
