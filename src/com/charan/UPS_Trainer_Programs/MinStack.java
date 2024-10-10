package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class MinStack {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr.add(x);
            if(arr1.size()==0||arr1.getLast()>=x){
                arr1.add(x);
            }
        }
        arr1.remove(arr1.size()-1);

        System.out.println(arr);
        System.out.println(arr1);


    }
}
