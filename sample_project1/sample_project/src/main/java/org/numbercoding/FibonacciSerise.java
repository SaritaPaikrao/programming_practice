package org.numbercoding;

import java.util.Scanner;

public class FibonacciSerise {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            int num=scanner.nextInt();
            int first=0;
            int second=1;
            if(num<=0){
                System.out.println("Number can not be negative or zero");
                return;
            }
            if(num==1){
                System.out.println(first);
            }
            else if(num==2){
                System.out.println(second);
            }else {

                int curr = 0;
                for(int i=3;i<=num;i++){
                    curr=first+second;
                    first=second;
                    second=curr;
                }

                System.out.println(curr);
            }
        }
    }

