package question7;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W", 150, "Manual");
        System.out.println(c1.name+"  "+c1.strans+"  "+c1.maxSpeed);
        System.out.println(c2.name+"  "+c2.strans+"  "+c2.maxSpeed);
    }

}
class Vehicle{
    String name = "4W";
    int maxSpeed = 100;
    Vehicle(String type, int speed){
        this.name = type;
        this.maxSpeed = speed;
    }
    Vehicle(){}
}
class Car extends Vehicle{
    String strans;
    Car(String strains){
        this.strans = null;
    }
    Car(String type, int maxSpped, String strans){
        super();
        this.strans = strans;
    }
}
