
package DataStructureDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("size = "+number.size());
        
        number.add(0,10);
        number.add(1,0);
        number.add(2,-3);
        number.add(3,5);
        number.add(4,11);
        number.add(5, 20);
       System.out.println("Arraylist = "+number);
       
       number.remove(5);
       System.out.println("Arraylist = "+number);
       
       boolean check = number.isEmpty();
       System.out.println("Arraylist is empty = "+check);
       
       boolean contain = number.contains(11);
       System.out.println("Arraylist contains 11 = "+contain);
       
       int pos = number.indexOf(11);
       System.out.println("Index position of value 11 = "+pos);
       
       int x = number.get(4);
       System.out.println("value assign from index = "+x);
       
       number.set(4, 9);
       System.out.println("Arraylist(after replacing index value) = "+number);
       
       ArrayList<Integer> number1= new ArrayList<>();
       number1.addAll(number);
       System.out.println("Arraylist number1 = "+number1);
       
       boolean equity = number1.equals(number);
       System.out.println("Arraylists are equal = "+equity);
       
       System.out.println("Arraylist = "+number);
       Collections.sort(number);
       System.out.println("Arraylist after sorting in ascending order  = "+number);
       
       Collections.sort(number,Collections.reverseOrder());
       System.out.println("Arraylist after sorting in descending order = "+number);
       
       number.removeAll(number);
       // also number.clear(); can be used too
       System.out.println("Arraylist = "+number);
    } 
}
