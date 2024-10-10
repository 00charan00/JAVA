package com.charan.UPS_Trainer_Programs;

import java.util.*;

public class Vowels {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);

                String input = sc.next();
                int vowelCount = 0;
                char[] vowels = {'a', 'e', 'i', 'o', 'u'};

                for (char ch : input.toCharArray()) {
                    for (char vowel : vowels) {
                        if (ch == vowel) {
                            vowelCount++;
                            break;
                        }
                    }
                }

                System.out.println("Number of vowels: " + vowelCount);
    }
}


