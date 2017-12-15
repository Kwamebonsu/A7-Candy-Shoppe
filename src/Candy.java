/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class Candy extends DessertItem {
    // Instance Variables

    private double weight;
    private int pricePerLbs;
    // Constructor

    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    @Override
    public String toString() {
        // Add name and cost
        String output = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb";
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        output += "\n" + this.getName();
        // Create spaces
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - this.getName().length() - holder.length(); i++) {
            output += " ";
        }
        output += holder;

        return output;
    }

    @Override
    public int getCost() {
        // Calculate the cost by multiplying weight and price/lbs, round it then cast it as an integer
        int cost;
        cost = (int) Math.round(this.weight * this.pricePerLbs);
        return cost;
    }
}