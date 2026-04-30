package org.javaCertificationPractice;

public class Test4 {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i<arr.length;i++){
            for(int j= 0; j<arr[i].length; j++){
                System.out.println(arr[i][j]+" ");
                if(arr[i][j].equals("B")){
                    break;
                }
            }
            continue;
        }
    }

}
class Vehicle{
    int x;
    Vehicle(){
        this(10);
    }
    Vehicle(int x){
        this.x =x;
    }
}
class Car extends Vehicle{
    int y ;
    Car(){
        super();
      //  this(20);
    }
    Car(int y){
        this.y=y;
    }
}