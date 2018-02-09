package edu.ldsbc.assignment4;

/**

 **/
public class Cookie extends DesertItem {

    private double amount;
    private double pricePerDozen;

    public Cookie(String name, double amount, double pricePerDozen) {
        super(name);
        this.amount = amount;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int calculateItemCost() {
        return (int) (( amount / 12) * pricePerDozen);
    }

    @Override
    public String toString() {
        return "Cookie Name: " + super.getName() +
                ", Amount: " + amount +
                ", PricePerDozen: " + pricePerDozen;
    }
}
