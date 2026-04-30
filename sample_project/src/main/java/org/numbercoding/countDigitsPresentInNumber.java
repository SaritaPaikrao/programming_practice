package org.numbercoding;

public class countDigitsPresentInNumber {
    public static void main(String[] args) {
        int num=12345;
       int count= digitCount(num);

        System.out.println(num+" contains "+count);
    }

    public static int digitCount(int num) {
        if(num==0){
            return 1;
        }
        if(num<0){
            num=-num;
        }
        int cnt=0;
        while(num!=0){
            num=num/10;
            cnt=cnt+1;
        }
        return cnt;
    }
}
