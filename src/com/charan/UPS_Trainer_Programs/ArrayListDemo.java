package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Iterator<Integer> itr= arr.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        int size=arr.size();
        System.out.println("Size: "+size);
        System.out.println(arr.contains(sc.nextInt()));
        arr.set(0, sc.nextInt());
        System.out.println(arr);
        System.out.println(arr.get(0));
        arr.removeAll(arr);

    }

}
