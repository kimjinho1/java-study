package polymorphism;

public class VIPCustomer extends Customer{
    private int agentID;
    public double salesRatio;

    public VIPCustomer() {}

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        this.agentID = agentID;
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다";
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }
}
