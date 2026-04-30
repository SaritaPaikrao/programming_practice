package org.javaCertificationPractice;

public class FieldsAndIntialization {

    {
        num = 4;
    }
    static int num = 3;
    public FieldsAndIntialization(){
        num = 5;
    }

    int getNum(){
        num = 6;
        return num;
    }

    public static void main(String[] args) {
        FieldsAndIntialization fieldsAndIntialization = new FieldsAndIntialization();
        System.out.println(fieldsAndIntialization.num);
       // System.out.println(fieldsAndIntialization.getNum());
    }
}
