package com.irfanmorshed;

public class TaxCalculator2018 implements TaxCalculator {
    //variable declaration
    private double taxableIncome;

    //initializing variable using constractor
    public TaxCalculator2018(double taxableIncome){

        this.taxableIncome=taxableIncome;
    }

    //declare method to calculate tax
    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;
    }

}
