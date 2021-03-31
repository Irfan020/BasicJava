
package newjavapackage;

import java.util.Scanner;

public class CheckAbility2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
            int n;
            System.out.print("enter total row number = ");
            n=input.nextInt();
            
            for(int row=n; row>=1; row--){
                for(int s=row-1; s>=1; s--){
                    System.out.print(" ");
                }
                for(int col=row; col<=n; col++){
                    System.out.print(col);
                }
                for(int col=n-1; col>=row; col--){
                    System.out.print(col);
                }
                System.out.println();
            }
            for(int row=2; row<=n; row++){
                for(int s=row-1; s>=1; s--){
                    System.out.print(" ");
                }
                for(int col=row; col<=n; col++){
                    System.out.print(col);
                }
                for(int col=n-1; col>=row; col--){
                    System.out.print(col);
                }
                System.out.println();
            }
    }
    
}
