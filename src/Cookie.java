/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class Cookie extends DessertItem {
    // Instance variables

    private int number;
    private int pricePer12;
    // Constructor

    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    @Override
    public String toString() {
        // add the name, number, price per 12 and cost
        String fromSuper = super.toString();
        return fromSuper;
    }

    @Override
    public int getCost() {
        int cost;
        // Calculate the cost
        cost = (pricePer12 * number) / 12;
        return cost;
    }
}
