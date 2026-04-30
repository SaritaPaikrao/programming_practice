package loop_questions;

public class Question22 {
    public static void main(String[] args) {
        int x =5;
        do{
            System.out.println(x-- +" ");
        }while (x==0);

        while(x==5){
            System.out.println(x--);
        }
    }
}
