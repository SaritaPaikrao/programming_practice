package string_questions;

public class question12 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
        //ABCC as replacement is not assigned to any ta String
    }
}
