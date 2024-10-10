package com.charan.UPS_Trainer_Programs;
import java.util.*;


public class MissingPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        Arrays.sort(arr);




        for(int i=0;i<size-1;i++){
            // Check if the current element is positive and if the next element is not equal to the current element + 1
            if(arr[i]>0 && arr[i+1]!=(1-(arr[i]))){
                System.out.println(arr[i]+1);
                break;
            }
        }





    }
}
