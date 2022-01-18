package polymorphism;

public class GoldCustomer extends Customer{
    public double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        bonusRatio = 0.02;
        salesRatio = 0.1;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
