package com.charan.UPS_Trainer_Programs;

import java.util.Scanner;

public class StringMeth {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.nextLine());


        System.out.println("Length: "+ str.length());
        System.out.println("Index of Input: "+ str.indexOf(sc.next()));
        System.out.println("Reverse: "+ str.reverse());
        System.out.println("Substring(1, 3): " + str.substring(1, 3));
        System.out.println("Char At: " + str.charAt(0));






    }
}
