package string_questions;

public class Question38 {
    public static void main(String[] args) {
        double discount = 0;
        int qty = 90;
        if(qty>=90) {
            discount =  0.5;
        }
        if(qty>80 && qty <90){
            discount =  0.2;
        }
        System.out.println(discount);
    }
}
