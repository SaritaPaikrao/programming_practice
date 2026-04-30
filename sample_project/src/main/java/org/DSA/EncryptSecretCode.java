package org.DSA;

import java.util.Scanner;

public class EncryptSecretCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the secret code : ");
        long code = scanner.nextLong();

        long temp = code % 10;

        long encrepted = temp % 1000000007;

        System.out.println("Encrypted code : "+encrepted);
    }
}
