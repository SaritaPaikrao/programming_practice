package variable_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que132 {
    //int count;
    public static void main(String[] args) {
      //  System.out.println(count++);
        String[] arr = {"Hi", "How","ARe","you"};
        List<String> lits = new ArrayList<>(Arrays.asList(arr));
        if(lits.removeIf(s ->{
            System.out.println(s);return s.length()<=2;
        })){
            System.out.println("removed");
        }
    }
}
