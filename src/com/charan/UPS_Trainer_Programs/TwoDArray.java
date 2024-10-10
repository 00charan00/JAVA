package com.charan.UPS_Trainer_Programs;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("N: ");
        int n=sc.nextInt();

        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || n-1==i+j){
                    arr[i][j]=0;

                }

            }
        }
        System.out.println("New Matrix");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("One D");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
        }





    }
}
