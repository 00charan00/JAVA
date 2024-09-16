package com.charan.Programs;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

}
