package string_questions;

public class Question130 {
    public static void main(String[] args) {
        int ary[] = {10, 20, 30, 40, 50};
        int x = ary.length;
        /*do {
            x--;
            System.out.println(ary[x]);
        } while (x > +0);*/

        while(x>0){
          //  x--;
            System.out.println(ary[--x]);
        }
    }
}
