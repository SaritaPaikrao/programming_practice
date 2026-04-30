package org.javaCertificationPractice;

public class StringChangeAndReplace {
    public static void main(String[] args) {
        String sa = "A ";
        sa = sa.concat("B ");
        String sb = "C ";
        sa = sa.concat(sb);
        sa.replace('C','D');
        System.out.println(sa);
        sa = sa.concat(sb);
        System.out.println(sa);

    }
}
