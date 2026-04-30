package org.javaCertificationPractice;

public class Test1 {
    public static void main(String[] args) {
        int x = 5;
        while(isAvail(x)){
            System.out.println(x);
            x--;
        }
    }

    private static boolean isAvail(int x) {
        return x-- > 0 ? true : false;
    }
}
