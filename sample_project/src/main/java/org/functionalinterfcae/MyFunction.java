package org.functionalinterfcae;
@FunctionalInterface
public interface MyFunction {
    abstract int apply(int a);
    //abstract int add(int x, int y);
    default int add(int x, int y){

        return x+y;
    }
    static int sub(int x, int y){
        return x-y;
    }
    private int multiply(int z, int y){
        return z*y;
    }
}
