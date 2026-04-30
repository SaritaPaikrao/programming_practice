package consturctor_questions;

public class Question17 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount =  new CheckingAccount((int) (Math.random()*1000));
       //checkingAccount.amount=0;
      // checkingAccount.setAmount(0);
        checkingAccount.changeAmount(-checkingAccount.amount);
        System.out.println(checkingAccount.getAmount());
    }
}

class CheckingAccount{
    public int amount;
    public CheckingAccount(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void changeAmount(int x){
        amount +=x;
    }
}
