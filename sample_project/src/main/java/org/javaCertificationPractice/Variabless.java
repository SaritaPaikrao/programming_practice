package org.javaCertificationPractice;

public class Variabless {
    public static void main(String[] args) {

    }
    //local variables
  /*  public int valid(){
        int y =10;
        int x;
        //int sum = x+y; //x not initialized so compile time error
       // return sum;
    }*/
    public void check(boolean check){
        int answer;
        int oneBranch;
        if(check){
            oneBranch = 1;
            answer = 1;
        }else{
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(oneBranch); //doesnt compile 
    }
}
