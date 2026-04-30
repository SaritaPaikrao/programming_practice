package org.javaCertificationPractice;

public class Alpha {
    public static void main(String[] args) {
        AlphaA alphaA =  new AlphaA(100);
        AlphaA alphaA1 = new AlphaA(50);
        AlphaA alphaA2 = new AlphaA(125);
        alphaA.doPrint();
        alphaA1.doPrint();
        alphaA2.doPrint();
    }

}
class AlphaA{
    int ns;
    static int s;
    AlphaA(int ns){
        if(s < ns){
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = "+ns+" S = "+s);
    }
}
