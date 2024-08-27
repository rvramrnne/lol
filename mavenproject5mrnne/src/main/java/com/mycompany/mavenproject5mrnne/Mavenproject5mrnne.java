/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5mrnne;
import java.util.Scanner;
/**
 *
 * @author CL3-PC34
 */
public class Mavenproject5mrnne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
       int m1;
        System.out.println("MENU");
       System.out.println("[1] = Snacks");
       System.out.println("[2] = Drinks");
      
       //output
       
       System.out.println("Enter your choice:");
       m1 = input.nextInt();
       
               
       if (m1==1)
       {
           System.out.println("[1]V-CUT = 25");
           System.out.println("[2]PIATTOS = 35");
           System.out.print("Choose your Snacks: ");
           int m2 = input.nextInt();
           
           if (m2==1)
           {
                System.out.println("V-CUT 25 pesos");
                int vcut , pia;
                vcut = 25;
                pia = 35;
                
                   
                System.out.println("Would you like to order drinks? [1] yes or [2] no");
                int m3 = input.nextInt();
                
                if(m3==1)
                {
                System.out.println("Drinks");
                System.out.println("[1] - Chuckie 40 pesos");
                System.out.println("[2] - Dutchmill 35 pesos");
                 
                System.out.println("Choose your Drinks:");
                int m4 = input.nextInt();
                int chuckie , dutchmill;
                chuckie = 40;
                dutchmill = 35;
                
                if(m4==1)
                {
                System.out.println("Chuckie 40 pesos");
                int total;
                total = chuckie + vcut;
                System.out.println("Total is :" + total );
                  System.out.println("Enter your cash:" );
                  int cash = input.nextInt();
                  
                  while(cash<total)
                  {
                      System.out.println("Try Again" );
                      System.out.println("Enter your cash:" );
                      cash = input.nextInt();
                  }
                  
                      if(cash>=total)
                      {
                      int chng;
                      chng = cash - total;
                      System.out.println("Change is :" +chng );
                      }
                         }          
                            }    
                               }
           
           //2nd attempt
             
           if (m2==2)
           {
                System.out.println("PIATTOS 35 pesos");
                int vcut , pia;
                vcut = 25;
                pia = 35;
                
                   
                System.out.println("Would you like to order drinks? [1] yes or [2] no");
                int m3 = input.nextInt();
                
                if(m3==1)
                {
                System.out.println("Drinks");
                System.out.println("[1] - Chuckie 40 pesos");
                System.out.println("[2] - Dutchmill 35 pesos");
                 
                System.out.println("Choose your Drinks:");
                int m4 = input.nextInt();
                int chuckie , dutchmill;
                chuckie = 40;
                dutchmill = 35;
                
                if(m4==1)
                {
                System.out.println("DUTCHMILL 35 pesos");
                int total;
                total = dutchmill + pia;
                System.out.println("Total is :" + total );
                  System.out.println("Enter your cash:" );
                  int cash = input.nextInt();
                  
                  while(cash<total)
                  {
                      System.out.println("Try Again" );
                      System.out.println("Enter your cash:" );
                      cash = input.nextInt();
                  }
                  
                      if(cash>=total)
                      {
                      int chng;
                      chng = cash - total;
                      System.out.println("Change is :" +chng );
                      }
                         }          
                            }    
                               }
           
                                  }
       
     
      
       
       
    }
}
