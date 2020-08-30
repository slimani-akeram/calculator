
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {

    public static void main(String[] args) {
      
  
       Scanner inn = new Scanner(System.in) ;
       System.out.println("enter the first number ");
       int z = inn.nextInt();
       System.out.println("enter the operator ");
       String h = inn.next();
       System.out.println("enter the second number ");
       int g = inn.nextInt() ;
    
       
       switch (h) { 
           case "+" :
               sum sm = new sum();
               System.out.println(sm.sumNumber(z, g));
            break;
           case "*" :
               darb db = new darb();
               System.out.println(db.da(z, g));
            break;    
           case "/" :
               Dev dc = new Dev();
               System.out.println(dc.devler(z, g));
            break;
            case "-" :
               na9s ns = new na9s();
               System.out.println(ns.na9(z, g));
            break;
       
       }
        

    }
    
}
