package edu.ldsbc.assignment4;

import java.util.ArrayList;

/**

 **/
public class Checkout {

    ArrayList<DesertItem> list = new ArrayList<DesertItem>();

    public void add(DesertItem item) {
        list.add(item);
    }

    public int totalCost() {
        int totalCost = 0;

        for (DesertItem item:this.list) {
            totalCost += item.calculateItemCost();
        }
        return totalCost;
    }

    public int numberOfItems() {
        return this.list.size();
    }

    public String printReceipt() {
        String receipt = "";
        for (DesertItem item:this.list) {
            receipt += (item.toString() + "   Price: " + item.calculateItemCost() + "\n");
            //System.out.println(item);
        }
        return receipt;
    }

}
