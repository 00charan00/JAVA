package com.charan.Programs;

import java.util.Scanner;

public class TWODimensionalArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Size of First Matrix:");
        int row1= sc.nextInt();
        int col1= sc.nextInt();

        System.out.println("Size of Second Matrix:");
        int row2= sc.nextInt();
        int col2= sc.nextInt();

        if(col1!=row2){
            System.out.println("Matrix Multiplication is NOT POSSIBLE");
            System.exit(0);
        }
        int[][] mat1=new int[row1][col1];
        int[][] mat2=new int[row2][col2];
        int[][] mat3=new int[row1][col2];

        System.out.println("Enter First Matrix");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j]= sc.nextInt();
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                mat3[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(mat3[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
