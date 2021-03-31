

//assignment1: use switch case to output maximum days of each month

package wanghaibinlaoshi;

import java.util.Scanner;

public class DaysOfMonths {
    public static void main(String[] args) {
        System.out.println("One year contains of 12 months : ");
        System.out.println("1.January 2.February 3.March 4.April 5.May 6.June");
        System.out.println("7.July 8.August 9.September 10.October 11.November 12.December\n");
        Scanner userinput = new Scanner(System.in);
        int monthDays = 0; 
        String MonthName = "onidristo";

        System.out.print("Input a month number: ");
        int month = userinput.nextInt();

        System.out.print("Input a year: ");
        int year = userinput.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                monthDays = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    monthDays = 29;
                } else {
                    monthDays= 28;
                }
                break;
            case 3:
                MonthName = "March";
                monthDays= 31;
                break;
            case 4:
                MonthName = "April";
                monthDays= 30;
                break;
            case 5:
                MonthName = "May";
                monthDays = 31;
                break;
            case 6:
                MonthName = "June";
                monthDays = 30;
                break;
            case 7:
                MonthName = "July";
                monthDays = 31;
                break;
            case 8:
                MonthName = "August";
                monthDays = 31;
                break;
            case 9:
                MonthName = "September";
                monthDays = 30;
                break;
            case 10:
                MonthName = "October";
                monthDays = 31;
                break;
            case 11:
                MonthName = "November";
                monthDays = 30;
                break;
            case 12:
                MonthName = "December";
                monthDays = 31;
        }
        System.out.print("\n=> "+MonthName + " of " + year + " has " + monthDays + " days\n\n");
    }
//Solution By : Irfan Morshed (201853082040)
}

