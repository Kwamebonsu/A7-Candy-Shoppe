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
        // Add name, Weight, Price per pound and cost
        String fromSuper = super.toString();
        return fromSuper;
    }

    @Override
    public int getCost() {
        // Calculate the cost by multiplying weight and price/lbs and cast it as an integer
        int cost;
        cost = (int) (this.weight * this.pricePerLbs);
        return cost;
    }
}
