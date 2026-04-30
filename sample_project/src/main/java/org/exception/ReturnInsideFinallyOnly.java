package org.exception;

public class ReturnInsideFinallyOnly {
    public static void main(String[] args) {
        System.out.println(rretrunValueFromMethod());
    }

    public static int rretrunValueFromMethod(){
        int result =0;
        try{
            result=18/0;
        } catch (ArithmeticException e) {
            System.out.println(e);;
        }finally {
            return result;
        }
       // return 0; unreachable code
    }
}
