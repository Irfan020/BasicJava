
package newjavapackage;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int m,n,count=0;
        int total=0;
        System.out.print("Enter initial number = ");
        m=input.nextInt();
        System.out.print("Enter final number = ");
        n=input.nextInt();
        System.out.println("Prime numbers from "+m+" to "+n+" are : ");
        
        for(int i=m; i<=n; i++){
            for(int j=2; j<i-1; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                if(i!=0 && i!=1){ // 0 and 1 is not a prime number
                System.out.println(i);
                total++;
                }
            }
            count=0;
        }
        System.out.println("Total Prime Numbers found = "+total);
    }
    
}
