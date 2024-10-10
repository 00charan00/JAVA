package com.charan.UPS_Trainer_Programs;

import java.util.*;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> Hmap = new HashMap<>();
        Hmap.put(1, "A");
        Hmap.put(2, "B");
        Hmap.put(3, "C");
        Iterator<Map.Entry<Integer, String>> ItrHmap = Hmap.entrySet().iterator();
        while (ItrHmap.hasNext()) {
            Map.Entry<Integer, String> mp = ItrHmap.next();
            System.out.println(mp.getKey() + "->" + mp.getValue());
        }
    }
}
