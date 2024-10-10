package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
            lst.add(10);
            lst.add(20);
            lst.add(30);
        System.out.println(lst);
        Collections.reverse(lst);
        System.out.println(lst);
        Iterator<Integer> itr=lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}