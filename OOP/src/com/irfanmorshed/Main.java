package com.irfanmorshed;

public class Main {

    public static void main(String[] args) {
        var cal = new TaxCalculator2018(1000);
        // constructor injection
        var report = new TaxReport(cal);
        report.show();

        //method injection
//        var report = new TaxReport();
//        report.show(cal);
//        report.show(new TaxCalculator2019());

        //var calc = new TaxCalculator2019();
        //report.setCalculator(calc);
        //alternate setter injection
        report.setCalculator(new TaxCalculator2019());
        report.show();
    }
}
