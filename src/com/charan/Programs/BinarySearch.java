package com.charan.Programs;
import java.util.Scanner;


public class BinarySearch {
    public static int bs(int[] arr,int x){
        int n=arr.length;
        int l=0,r=n-1;
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;

            if(x==arr[mid]){
                return 1;
            }
            else if(arr[mid]>x){
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Array Size: ");
        int n=sc.nextInt();
        System.out.print("Array Elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("To find: ");
        int x= sc.nextInt();
        int res=bs(arr,x);
        System.out.println((res==1)?"Found":"Not Found");
    }
}
