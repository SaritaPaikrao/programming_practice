package org.functionalinterfcae;

public class FunctionalMainClass {
    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction() {
            @Override
            public int apply(int a) {
                return a / 2;
            }
        };
        System.out.println("Division " + myFunction.apply(20));
        System.out.println("Addition " + myFunction.add(10, 10));
        System.out.println("Subtraction " + MyFunction.sub(40, 10));
        //System.out.println("Multiplication "+MyFunction.multiply(10,10));
    }
}
