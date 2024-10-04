package com.charan.Programs;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        String fruitAtIndex2 = fruits.get(2);
        System.out.println(fruitAtIndex2);
        fruits.set(1, "Strawberry");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println( fruits);
        fruits.remove("Apple");
        System.out.println(fruits);
        boolean hasBanana = fruits.contains("Banana");
        System.out.println(hasBanana);
        int size = fruits.size();
        System.out.println(size);
        System.out.println("Iterating through ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }

}
