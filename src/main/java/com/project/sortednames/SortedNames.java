/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.sortednames;
import java.util.Scanner;     
/**
 *
 * @author MKAY 
 */
public class SortedNames {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String name1;
        String name2;
        String name3;
        boolean validationValue1;
        boolean validationValue2;
        boolean validationValue3;
        String first;
        String second;
        String third;
        
                
        System.out.println("Enter a name: ");
        name1 = keyboard.nextLine();
        
        System.out.println("Enter another name: ");
        name2 = keyboard.nextLine();    

        System.out.println("Enter another name: ");
        name3 = keyboard.nextLine();
        
       
        validationValue1 = name1.equalsIgnoreCase(name2);
        validationValue2 = name2.equalsIgnoreCase(name3);
        validationValue3 = name3.equalsIgnoreCase(name1);
        
      
        while(validationValue1 == true || validationValue2 == true || validationValue3 == true)
        {
            
        System.out.println("You need to enter different names\nkindly follow the steps again ");
            
        System.out.println("Enter a name: ");
        name1 = keyboard.nextLine();
        
        System.out.println("Enter another name: ");
        name2 = keyboard.nextLine();    

        System.out.println("Enter another name: ");
        name3 = keyboard.nextLine();
        
            validationValue1 = name1.equalsIgnoreCase(name2);
            validationValue2 = name2.equalsIgnoreCase(name3);
            validationValue3 = name3.equalsIgnoreCase(name1);
        }
        
       if((name1).compareToIgnoreCase(name2)>0 && (name1).compareToIgnoreCase(name3) > 0)
       {
           if(name2.compareToIgnoreCase(name3) > 0)
           {
               first = name1;
               second = name2;
               third = name3;
           }
           else
           {
                first = name1;
               second = name3;
               third = name2;
           }
       }

      
        System.out.println("\nThe names in ascending order are:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        keyboard.close();
    }
    
}
