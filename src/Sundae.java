/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class Sundae extends IceCream {
    // Instance variables

    private String toppingName;
    private int toppingCost;

    // Constructor
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public String toString() {
        // Add name and cost
        String output = this.toppingName + " sundae " + "with\n";
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        output += this.getName();
        for (int i = 0; i < DessertShoppe.RECEIPT_WIDTH - this.getName().length() - holder.length(); i++) {
            output += " ";
        }
        output += holder;

        return output;
    }

    @Override
    public int getCost() {
        // Add the cost of the ice cream and the cost of the topping
        int total = super.getCost();
        total += this.toppingCost;
        return total;
    }
}
