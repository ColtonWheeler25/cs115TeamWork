package edu.ldsbc.assignment4;

/**

 **/
public class Sundae extends IceCream {

    private String topping;
    private int toppingCost;

    public Sundae(String name, int cost, String topping, int toppingCost) {
        super(name, cost);
        this.topping = topping;
        this.toppingCost = toppingCost;
    }

    @Override
    public int calculateItemCost() {
        return (toppingCost + super.calculateItemCost());
    }

    @Override
    public String toString() {
        return "Sundae Base Name: " + super.getName()  +
                ", topping: " + topping +
                ", Topping Cost: " + toppingCost;
    }
}
