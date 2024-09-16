package com.charan.Programs;

import java.util.Scanner;

public class RemoveLeading0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeLeadingZero(str));
    }

    public static String removeLeadingZero(String s) {
        int index=0;
        for(int i = 0 ; i < s.length();i++) {
            if(s.charAt(i)!='0') {
                index = i;
                break;
            }
        }
        s=s.substring(index,s.length());
        return s;
    }
}
