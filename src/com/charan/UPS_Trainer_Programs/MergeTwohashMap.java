package com.charan.UPS_Trainer_Programs;

import java.util.HashMap;

public class MergeTwohashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        HashMap<Integer,String> hm2=new HashMap<>();
        hm1.put(1,"A");
        hm1.put(2,"B");
        hm2.put(3,"C");
        hm2.put(4,"D");
        hm2.putAll(hm1);
        System.out.println(hm1);
        System.out.println(hm2);
    }
}
