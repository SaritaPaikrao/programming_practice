package org.javaCertificationPractice;

public class ForLoopConditions {
    public static void main(String[] args) {
       StringBuilder stringBuilder = new StringBuilder("Java");
       String s = "Java";
       if(stringBuilder.toString().equals(s)){
           System.out.println("match 1");
       }else if(stringBuilder.equals(s)){
           System.out.println("match 2");
       }else{
           System.out.println("no match");
       }

        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
                break;
            case "Apple":
                System.out.println("APPLE");
                break;
            case "Mango":
                System.out.println("MANGO");
                break;
            case "Banana":
                System.out.println("BANANA");
                break;
        }
        System.out.println("----------------------------");
        int [] arr = {2,1,0};
        for(int i : arr) {
            System.out.println(arr[i]);
        }
        Double [] arr1 = new Double[2];
        System.out.println(arr1[0] + arr1[1]);
    }
}
