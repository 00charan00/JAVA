package com.charan.Programs;

import java.util.Vector;

public class VectorJavaMethods {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println(
                vector.get(0));
        System.out.println("Vector Contents:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
        vector.set(1, "Blueberry");
        System.out.println( vector.get(1));
        vector.remove("Cherry");
        System.out.println( vector.size());
        System.out.println(vector.isEmpty());
        vector.clear();
        System.out.println(vector.isEmpty());
    }
}
