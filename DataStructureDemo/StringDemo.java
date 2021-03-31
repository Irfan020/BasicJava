
package DataStructureDemo;

public class StringDemo {
    public static void main(String[] args){
        String s0=("irfan");
        String s1 = ("Irfan");
        String s2 = new String(" Morshed");
        
        String s3= s1.concat(s2);
        
        System.out.println(s3);
        System.out.println(s3.length());
        
        System.out.println(s3.equals(s1));
        System.out.println(s0.equalsIgnoreCase(s1));
        System.out.println(s3.contains("Irfan"));
        System.out.println(s3.isEmpty());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s3.startsWith("I"));
        System.out.println(s3.endsWith("d"));
        
        String s4 = new String(" Mister Irfan was ran out  ");
        
        System.out.println(s4.trim());//trim openning and ending spaces
        System.out.println(s4.charAt(3));
        System.out.println(s4.codePointAt(1));//ASCII value of index 1 M
        System.out.println(s4.indexOf("was"));
        System.out.println(s4.lastIndexOf('r'));
        System.out.println(s4.replace("Irfan", "Morshed"));
        
        String[] s5 = s4.split(" ");// split where is space
        for(String x: s5){
            System.out.println(x);
        }
           
    }
    
}
