package string_questions;

public class Question49 {
    public static void main(String[] args) {
        String str = " ";
        System.out.println(str.length());
        str.trim();
        System.out.println(str.length());
        System.out.println(str.equals(""));
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}
