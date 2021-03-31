/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wanghaibinlaoshi;

import java.util.*;

/**
 *
 * @author IRFAN
 */
public class UsingFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        String[] monthes = {"January", "February", "March", "April",
                            "May", "June", "July", "August",
                            "September", "October", "November", "December"};
        int feb = 0;
        if (year % 4 == 0 &&
            year % 100 != 0 ||
            year % 100 == 0 &&
            year % 400 == 0)
            feb = 29;
        else
            feb = 28;

        int[] days = {31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.printf("%s 2016 has %d days", monthes[month-1], days[month-1]);


    }
}