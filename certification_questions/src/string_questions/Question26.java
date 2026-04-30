package string_questions;

import java.util.ArrayList;
import java.util.List;

public class Question26 {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>();
        strlist.add("Rock");
        strlist.add("Bran");
        strlist.add("Rick");
        strlist.add("Bran");
        if(strlist.removeIf(s->s.equals("Bran"))){
            strlist.remove("Jon");
        }
        System.out.println(strlist);
    }
}
