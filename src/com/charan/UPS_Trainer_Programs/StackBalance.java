package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression:");
        String expression = sc.nextLine();

        Stack<Character> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();

        boolean isBalanced = true;

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if (current == '(') {
                st.push(current);
            } else if (current == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) {
            isBalanced = false;
        }
        if (isBalanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
