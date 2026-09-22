package com.amigoscode._2_developers._5_methods;

public class RentalYieldCalculator {
    static void main() {
        calculate(250000, 1300);
    }

    public static void calculate(double purchasePrice, double rent) {
        double annualRentalIncome = rent * 12;
        double annualRentalYield = (annualRentalIncome / purchasePrice) * 100;
        System.out.printf("The annual rental yield: %.2f%%", annualRentalYield);
    }
}
