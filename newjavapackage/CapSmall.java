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
public class CapSmall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a letter: ");
        ch=input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println(ch+" is a small letter");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println(ch+" is a Capital Letter");
        }
        else{
            System.out.println(ch+" is not a letter");
        }
        
        
    }
}
