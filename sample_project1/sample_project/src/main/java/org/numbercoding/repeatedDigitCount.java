package org.numbercoding;

public class repeatedDigitCount {
    public static void main(String[] args) {
        int num=1234324537;
        int digit=3;

        int count=getRepeatedDigitCount(num,digit);
        System.out.println("count of 3 is "+count);
    }

    private static int getRepeatedDigitCount(int num, int digit) {
        if(num==0 && digit==0){
            return 1;
        }
        if(num<0){
            num=-num;
        }
        int cnt=0;
        while(num!=0){
            int dig=num%10;
            if(dig==digit){
                cnt=cnt+1;
            }
            num=num/10;
        }
        return cnt;
    }
}
