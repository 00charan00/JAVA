package com.charan.UPS_Trainer_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("To replace index: ");
        int index= sc.nextInt();
        System.out.print("new number: ");
        int newNum= sc.nextInt();
        arr[index]=newNum;
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.print("To delete index: ");
        int delindex= sc.nextInt();
        arr[delindex]=0;
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
