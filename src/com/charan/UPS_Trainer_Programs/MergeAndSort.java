package com.charan.UPS_Trainer_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter elements of the first array (sorted):");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        System.out.println("Enter elements of the second array (sorted):");
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = mergeAndSort(array1, array2);
        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n) {
            merged[k++] = arr1[i++];
        }

        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}

