/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class IceCream extends DessertItem {
    // Instance variable

    private int cost;
    // Constructor

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    public String toString() {
        // Add the name and cost
        String fromSuper = super.toString();
        return fromSuper;
    }

    @Override
    public int getCost() {
        // return the cost as is
        return cost;
    }
}
