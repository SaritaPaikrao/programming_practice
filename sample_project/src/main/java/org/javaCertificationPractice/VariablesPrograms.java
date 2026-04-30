package org.javaCertificationPractice;

import java.util.ArrayList;
import java.util.List;

public class VariablesPrograms {
    static Double d1;
    int x = d1.intValue();
    private static void m(int i, int j) {
        i++;
        j--;
    }
    public static void main(String[] args) {

        
        int a = 3;
        m(++a, a++);
        System.out.println(a);

        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove(3);
        }

        for(char ch : list) {
            System.out.print(ch);
        }
        System.out.println("===================");
        int i;
        for(i=0; i<=2; i++){}
        System.out.println(i);
        System.out.println("------------");
        System.out.println("HELOO");
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;
       // String s4 = (String)(s3 * s2); type casting compilation error
      //  System.out.println(s4);
        char c = 'Z';
        System.out.println(c);
        long l = 100_00l;
        //int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        System.out.println(l+"   "+i);
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;
    }
}
