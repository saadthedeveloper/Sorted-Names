/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.sortednames;
import java.util.Scanner;     
/*
This is a program that asks the user to enter three names, and then displays the names sorted 
in ascending order. For example, if the user entered “Charlie”, “Leslie”, and “Andy”, the 
program would display:
 1. Andy
 2. Charlie
 3. Leslie
 */
public class SortedNames {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //Variable declaration region below
        String name1;
        String name2;
        String name3;
        boolean validationValue1;
        boolean validationValue2;
        boolean validationValue3;
        String first = "space";
        String second = "space";
        String third = "space";
        //Variable declaration region above
                
        System.out.println("Enter a name: ");
        name1 = keyboard.nextLine();
        
        System.out.println("Enter another name: ");
        name2 = keyboard.nextLine();    

        System.out.println("Enter another name: ");
        name3 = keyboard.nextLine();
        
       
        validationValue1 = name1.equalsIgnoreCase(name2);
        validationValue2 = name2.equalsIgnoreCase(name3);
        validationValue3 = name3.equalsIgnoreCase(name1);
        
       // Validation; The user should'nt enter the same name more than once
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



       // Sorting names using decision structures below 
        
       if((name1).compareToIgnoreCase(name2)<0 && (name1).compareToIgnoreCase(name3) < 0)
       {
           if(name2.compareToIgnoreCase(name3) < 0)
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
        
       
       
       if((name2).compareToIgnoreCase(name1) < 0 && (name2).compareToIgnoreCase(name3) < 0)       {
           if(name1.compareToIgnoreCase(name3) < 0)
           {
               first = name2;
               second = name1;
               third = name3;
           }
           else
           {
                first = name2;
               second = name3;
               third = name1;
           }
       }
        
       
       
       
       if((name3).compareToIgnoreCase(name1) < 0 && (name3).compareToIgnoreCase(name2) < 0)
       {
           if(name2.compareToIgnoreCase(name3) < 0)
           {
               first = name3;
               second = name2;
               third = name1;
           }
           else
           {
                first = name3;
               second = name1;
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
