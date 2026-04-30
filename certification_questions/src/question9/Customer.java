package question9;

public class Customer {
ElectronicAccount electronicAccount = new ElectronicAccount();
public void useElectricity(double kWl){
    electronicAccount.addKWh(kWl);
}
}
class ElectronicAccount{
    private double kWh;
    private double rate = 0.07;
    private double bill;

    public void addKWh(double kWh) {
        this.kWh += kWh;
        this.bill = this.kWh * this.rate;
    }
}
