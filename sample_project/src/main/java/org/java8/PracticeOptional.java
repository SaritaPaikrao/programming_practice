package org.java8;

import javax.swing.text.html.Option;
import java.util.Optional;

public class PracticeOptional {
    public static void main(String[] args) {
        int i = 1;
        Optional<String> name = getName(i);
        //String s = name.isPresent() ? name.get() : "Sari";
        name.ifPresentOrElse(
                s -> System.out.println("Value present as "+s),
        () -> System.out.println("Value not present"));
       // System.out.println(s);

    }

   public static Optional<String> getName(int i){
       return Optional.ofNullable("Sarita");
   }
}
