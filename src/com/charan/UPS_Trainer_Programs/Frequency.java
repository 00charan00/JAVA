package com.charan.UPS_Trainer_Programs;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 4, 4, 5};
        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        System.out.println(mp);
    }
}
