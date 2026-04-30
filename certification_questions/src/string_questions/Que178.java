package string_questions;

public class Que178 {
    public static void main(String[] args) {
        String st = new String("Ja");
        System.out.println(st);
        System.out.println(new MyString("java se"));
        System.out.println(new StringBuilder("Java Java"));
    }
}
class MyString{
    String str;
    MyString(String str){
        this.str=str;
    }
}
