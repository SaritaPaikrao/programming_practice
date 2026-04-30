package org.exception;

import java.util.Scanner;

public class CustumException {
    public static void main(String[] args) throws AgeIsNegative {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Age :");
        int age=scanner.nextInt();
        try {
            if (age < 0) {
                throw new AgeIsNegative("Invalid age entered..");
            } else {
                System.out.println("Age is " + age);
            }
        } catch (AgeIsNegative e) {
            System.out.println(e);
        }
    }

}

class AgeIsNegative extends Exception{
    public String message;
    public AgeIsNegative(String msg)
    {
        this.message=msg;
    }
    @Override
    public String toString() {
        return message;
    }
}