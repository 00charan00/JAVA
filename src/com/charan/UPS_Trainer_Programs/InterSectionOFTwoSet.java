package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class InterSectionOFTwoSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<size;i++){
            arr2.add(sc.nextInt());
        }
        for(int i=0;i<size;i++)
            if(arr.contains(arr2.get(i))){
                System.out.println(arr2.get(i));

        }
    }
}

