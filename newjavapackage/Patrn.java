/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjavapackage;

import java.util.Scanner;

/**
 *
 * @author IRFAN
 */
public class Patrn {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("enter row number= ");
        n=input.nextInt();
        
        for(int row=n; row>=1; row--){
            for(int s=0; s<=row; s++){
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
            for(int s=0; s<=row; s++){
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