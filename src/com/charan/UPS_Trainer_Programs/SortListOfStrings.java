package com.charan.UPS_Trainer_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListOfStrings {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("Hello");
        lst.add("xello");
        lst.add("Aello");
        Collections.sort(lst);
        System.out.println(lst);
    }
}
