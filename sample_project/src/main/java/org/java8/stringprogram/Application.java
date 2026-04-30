package org.java8.stringprogram;

public class Application {
    public static void main(String[] args) {
        Samp samp= new Samp();
        samp.getInfo();
    }
}

class Samp implements  Polygon{

    @Override
    public void getInfo() {
        System.out.println("I am Polygon, Implemented in sample class");
    }
}