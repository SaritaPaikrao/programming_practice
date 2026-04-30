package org.javaCertificationPractice;

import java.io.IOException;

public class MyExceptionClass {
    public static void main(String[] args) {
        try{
            method1();
        }catch (MyException myException){
            System.out.println("A");
        }
    }

    private static void method1() {
        try{
            throw 3>10 ? new MyException() : new IOException();

        }
        catch (IOException e){
            System.out.println("I");
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}
class MyException extends RuntimeException{

}
