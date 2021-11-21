package ch04;

public class VIPCustomer extends Customer {

    int bonusPoint;
    double bonusRatio;

    double salesRatio;
    String agentID;

/*    public VIPCustomer() {
        //super(); //컴파일러가 자동으로 생성해줌.

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() VIP");
    }*/

    public VIPCustomer(int customerID, String customerName) {
        super(customerID , customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentID() {

        return agentID;
    }
}
