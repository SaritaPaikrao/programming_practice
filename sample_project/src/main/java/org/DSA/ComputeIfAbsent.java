package org.DSA;

import java.util.HashMap;

public class ComputeIfAbsent {
    public static void main(String[] args) {
        HashMap<String, Integer> hm  =new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        System.out.println("Intial Map "+hm);

        Integer i = hm.computeIfAbsent("C", key -> key.length());
        Integer j = hm.computeIfAbsent("B", k->k.length());
        System.out.println("C : "+i);
        System.out.println("B "+j);
        System.out.println("New map "+hm);
    }
}
