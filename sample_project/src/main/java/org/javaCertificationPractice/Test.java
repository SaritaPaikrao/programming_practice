package org.javaCertificationPractice;

public class Test {
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading card");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking card");
    }

    public static void main(String[] args) {
        Test test = new Test();
        int cardNo = 12344;
        //test.readCard(cardNo);
        test.checkCard(cardNo);

    }
}
