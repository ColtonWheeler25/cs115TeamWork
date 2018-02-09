package edu.ldsbc.assignment4;

/**

 **/
public class Candy extends DesertItem {

    private double weight;
    private double costPerLb;

    public Candy(String name, double weight, double costPerLb) {
        super(name);
        this.weight = weight;
        this.costPerLb = costPerLb;
    }

    @Override
    public int calculateItemCost() {
        return (int) (weight * costPerLb);
    }

    @Override
    public String toString() {
        return "Candy Name: " + super.getName()  +
                ", Weight: " + weight +
                ", costPerLb: " + costPerLb;
    }
}
