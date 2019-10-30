/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;
import java.util.Scanner;


public class CandyMachine {

   private static Scanner kb = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Welcome to CHS's Comptuer Candy Machine!");
        System.out.println("All candy provided is virtual.");
                
       System.out.print("How much money do ya got? > ");
       double money1 = kb.nextDouble(); 
       System.out.println("Well, lemme tell ya what we got here. ");
       System.out.println("A          $1.00    Twix");
       System.out.println("B          $0.25    Gum");
       System.out.println("C          $0.75    Chips");
       System.out.println("D          $1.00    Skittles");
       System.out.println("E          $0.50    Gummy Bears");
       candy();
    }
    public static double candy()
    {
     System.out.print("So, What'll ya have? > ");
     String choice = kb.nextLine();
     if(choice.equalsIgnoreCase("A"))
     {
         return 1.00;
     }    
     else if(choice.equalsIgnoreCase("B")) 
     {
         return 0.25;
     }    
     else if(choice.equalsIgnoreCase("C"))
     {
         return 0.75;
     }  
     else if(choice.equalsIgnoreCase("D"))
     {
         return 1.00; 
     }    
     else if(choice.equalsIgnoreCase("E"))
     { 
         return 0.50;
     }  
     else
     {
         return 0;
     }    
        
    
        
        
        
        
        
        
        
        
        
        
    }
      
    
    
    
    
    
    
    
    
    
    
    
}
