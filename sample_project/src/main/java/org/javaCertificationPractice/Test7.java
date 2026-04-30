package org.javaCertificationPractice;

public class Test7 {
    public static void main(String[] args) {
        String strs[] = {"A","B"};
        int idx =0;
        for (String s:strs){
           String ss = strs[idx].concat(" elem "+idx);
            System.out.println(ss);
            idx++;
        }
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
            
        }
    }
}
