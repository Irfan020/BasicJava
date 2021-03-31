
package newjavapackage;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num,temp,r,sum=0;
        System.out.print("enter a number : ");
        num=input.nextInt();
        temp=num;
        
        while(temp!=0){
            r= temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("Reverse number of number "+num+" is = "+sum);
        if(num==sum){
            System.out.println(num+" is a palindrome number");
        }
        else{
            System.out.println(num+" is NOT a palindrome number");
        }
    }
    
}
