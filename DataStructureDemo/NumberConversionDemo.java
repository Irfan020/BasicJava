
package DataStructureDemo;

import java.util.Scanner;

public class NumberConversionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.print("Enter a decimal number = ");
        decimal=input.nextInt();
        
        String b = Integer.toBinaryString(decimal);
        System.out.println("To binary = "+b);
        
        String o = Integer.toOctalString(decimal);
        System.out.println("To octal = "+o);
        
        String h = Integer.toHexString(decimal);
        System.out.println("To hexadecimal = "+h);
    }
}
