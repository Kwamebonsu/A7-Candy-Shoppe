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
        // Add name and cost
        String output = this.number + " @ " + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz";
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
        int cost;
        // Calculate the cost
        cost = (int) (pricePer12 * number) / 12;
        return cost;
    }
}