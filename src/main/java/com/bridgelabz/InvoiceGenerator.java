package com.bridgelabz;

public class InvoiceGenerator {
    /*
    Cab Invoice Generator
     */
    //Global Variable Declaration.
    private static final double MIN_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5.0;

    /*
    Calculating Fare
     */
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MIN_COST_PER_KM + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }
}
