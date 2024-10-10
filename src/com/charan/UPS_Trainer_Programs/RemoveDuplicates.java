package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<size;i++){
            if(!arr2.contains(arr.get(i))){
                arr2.add(arr.get(i));
            }
        }
        System.out.println(arr2);
    }
}
