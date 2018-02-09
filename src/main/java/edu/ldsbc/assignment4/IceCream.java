package edu.ldsbc.assignment4;

/**

 **/
public class IceCream extends DesertItem {
    private int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int calculateItemCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "IceCream Name: " + super.getName() +
                ", Cost: " + cost;
    }
}
