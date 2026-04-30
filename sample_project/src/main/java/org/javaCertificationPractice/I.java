package org.javaCertificationPractice;

public interface I {
    public void display();
}
abstract class C2 implements I{
    public void displayC2(){
        System.out.println("C2");
    }
}
class C1 extends C2{
    public void display(){
        System.out.println("C1");
    }
}
