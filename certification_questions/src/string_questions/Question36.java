package string_questions;

public class Question36 {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("Duke");
        String s = sb.toString();
        String s2 = s;
        System.out.println(s==s2);
     }
}
