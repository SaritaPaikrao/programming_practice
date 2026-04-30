package org.exception;

public class ReturnAfterTryCatch {
    public static void main(String[] args) {
        System.out.println(retrunValueFromMethod());
    }

    private static int retrunValueFromMethod() {
        int result=0;
        try{
            result=18/0;
        } catch (ArithmeticException e) {
            System.out.println("Hello "+e);;
        }finally {
            System.out.println("Finally block always execute for resource cleanup..");
        }
       // return result;
        return result;
    }
}
