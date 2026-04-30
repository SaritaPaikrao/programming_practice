package org.example;

public class repeatedDigitCount {
    public static void main(String[] args) {
        int num=1234323537;
        int digit=3;

        int count = 0;
        while(num!=0){
            int dig = num%10;
            if(dig==digit){
                count++;
            }
            num = num/10;
        }

        System.out.println("count of 3 is "+count);
    }
}
