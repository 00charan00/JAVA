package com.charan.Programs;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(stringPalindrome(str));
    }
    static Boolean stringPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left)!= str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
