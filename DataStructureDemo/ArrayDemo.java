
package DataStructureDemo;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         double[] number = new double[5];
         double sum=0;
         System.out.print("Enter 5 numbers : ");
        for(int i=0; i<number.length; i++){ 
         number[i]= input.nextDouble();
        }
        // different way
        for(double x: number){
            sum=sum+x;
        }
        System.out.println("sum = "+sum);
         
         
         double max = number[0];
         double min = number[0];
         for(int i=1; i<number.length; i++){
             if(max<number[i]){
                 max=number[i];
             }
             if(min>number[i]){
                 min=number[i];
             }
         }
         System.out.println("maximum = "+max);
         System.out.println("minimum = "+min);
    }
    
}
