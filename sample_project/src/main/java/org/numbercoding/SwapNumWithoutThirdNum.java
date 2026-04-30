package org.numbercoding;

public class SwapNumWithoutThirdNum {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before a= "+a+" , b= "+b);
        a=a+b;  //a=30
        b=a-b;  //b=30-20 =10
        a=a-b;
        System.out.println("After a= "+a+" , b= "+b);


    }
}
