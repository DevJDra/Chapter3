package ch02;

public class VIPCustomer extends Customer{

    int bonusPoint;
    double bonusRatio;

    double salesRatio;
    String agentID;

    public VIPCustomer() {

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentID() {
        return agentID;
    }
}
