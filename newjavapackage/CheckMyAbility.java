
package newjavapackage;

import java.util.Scanner;

public class CheckMyAbility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the total number of row = ");
        n = input.nextInt();
        
        for(int row=1; row<=n; row++){
            for(int col=n-row; col>=1; col--){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            for(int col=row-1; col>=1; col--){
                System.out.print(col);
            }
            System.out.println();
        }
        for(int row=n-1; row>=1; row--){
            for(int col=n-row; col>=1; col--){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            for(int col=row-1; col>=1; col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
