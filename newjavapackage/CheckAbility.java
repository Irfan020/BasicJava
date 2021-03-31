
package newjavapackage;

import java.util.Scanner;

public class CheckAbility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter total row number = ");
        n = input.nextInt();
        
        for(int row=1; row<=n; row++){
            for(int s=n-row; s>=1; s--){
                System.out.print(" ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        for(int row=n-1; row>=1; row--){
            for(int s=n-row; s>=1; s--){
                System.out.print(" ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
