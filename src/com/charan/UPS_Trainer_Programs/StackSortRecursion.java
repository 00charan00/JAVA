package com.charan.UPS_Trainer_Programs;

import java.util.Scanner;
import java.util.Stack;

public class StackSortRecursion {
    public static void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
        } else {
            int top = stack.pop();
            sortedInsert(stack, element);
            stack.push(top);
        }
    }
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            sortedInsert(stack, top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        for(int i=0;i<size;i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Original stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }
}
