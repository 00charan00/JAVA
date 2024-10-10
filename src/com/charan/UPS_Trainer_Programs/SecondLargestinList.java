package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestinList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-2));
    }
}
