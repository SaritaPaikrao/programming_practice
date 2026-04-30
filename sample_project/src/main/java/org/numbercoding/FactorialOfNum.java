package org.numbercoding;

public class FactorialOfNum {
    public static void main(String[] args) {
        int n=0;
        long num= factorial(n);
        System.out.println(n+" "+num);
    }
    public static long factorial(long n) {
        if(n==0)
            return 0;
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

}
