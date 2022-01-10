package com.irfanmorshed;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principle = (int)readNumber("Principle: ",1000,1000000);
        float annualInterest = (float)readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte)readNumber("Period(years): ",1,30);

        printMortgage(principle, annualInterest, years);

        printPaymentSchedule(principle, annualInterest, years);
    }

    private static void printMortgage(int principle, float annualInterest, byte years) {
        double mortgage = calculateMortgage (principle, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.print("Monthly Payments: "+mortgageFormatted);
    }

    private static void printPaymentSchedule(int principle, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for(short month = 1; month<= years *MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principle, annualInterest, years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, int min, int max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if(value>=min && value<=max)
                break;
            System.out.println("Enter a value between "+min+ "and "+max);
        }
        return value;
    }

    public static double calculateBalance(
            int principle,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ){

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numbersOfPayment = (short) (years * MONTHS_IN_YEAR);

        double balance;
        balance = principle
                * (Math.pow(1 + monthlyInterest, numbersOfPayment) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numbersOfPayment) - 1);

        return balance;
    }


    public static double calculateMortgage (
            int principle,
            float annualInterest,
            byte years
    ){
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numbersOfPayment = (short) (years * MONTHS_IN_YEAR);

        double mortgage;
        mortgage = principle *
                (monthlyInterest * Math.pow(1+monthlyInterest,numbersOfPayment)) /
                (Math.pow(1+monthlyInterest,numbersOfPayment)-1);

        return mortgage;
    }
}
