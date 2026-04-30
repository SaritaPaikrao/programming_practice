package org.javaCertificationPractice;

public class Caller {
    public static void main(String[] args) {
        Caller1 caller1 = new Caller1();
        //caller1.start(); private method cannot be accessed outside the class
       // caller1.init();

    }
}

class Caller1{
    private void init(){
        System.out.println("Initailized .. ");
    }
    private void start(){
        init();
        System.out.println("Started ");
    }
}