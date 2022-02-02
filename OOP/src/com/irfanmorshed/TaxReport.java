package com.irfanmorshed;

public class TaxReport {

    //declaring TaxCalculator Object calculator
    private TaxCalculator calculator;

    //constructor injection
    public TaxReport(TaxCalculator calculator){
        this.calculator=calculator;
    }

    //method injection
//    public void show(TaxCalculator calculator){
//        var tax = calculator.calculateTax();
//        System.out.println(tax);
//    }

//    method in case of constructor/ setter dependency injection
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }


//    setter injection
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
