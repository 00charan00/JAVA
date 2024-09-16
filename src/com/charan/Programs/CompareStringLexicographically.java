package com.charan.Programs;

import java.util.Scanner;

public class CompareStringLexicographically {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1.compareTo(str2));
    }
}
