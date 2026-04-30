package consturctor_questions;

public class Question27 {
}

class A{
    public A(){
        System.out.println("A ");
    }
}
class B extends A{
    public B(){
        System.out.println("B ");
    }
}

class C extends B{
    public C(){
        System.out.println("C ");
    }

    public static void main(String[] args) {
        A a = new A();
        B b =(B)a;
    }
}