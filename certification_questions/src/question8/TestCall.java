package question8;

public class TestCall {
    public static void main(String[] args) {
        Caller caller =  new Caller();
       // caller.init(); compilation error
        //caller.start(); compilation error
    }
}
class Caller{
    private void init(){
        System.out.println("Initialized");
    }
    private void start(){
        init();
        System.out.println("Started");
    }
}