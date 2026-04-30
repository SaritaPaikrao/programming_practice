package org.array;

public class CheckValuePresentOrNot {
    public static void main(String[] args) {
        int[] aryList = {3,2,5,6,8,8,9,7};
        int ele=7;
        boolean find=false;
        for(int element:aryList){
            if(element==ele){
                find=true;
                break;
            }
        }

        System.out.println(ele+" is present? = "+find);
    }
}
