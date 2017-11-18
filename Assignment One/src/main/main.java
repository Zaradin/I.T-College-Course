package main;

import java.util.Scanner;
/**
 * Write a description of class main here.
 *
 * @author Josh Crotty
 * @version 0.5
 */
public class main
{
    public static void main(String[] args)
    {
        // Clear terminal for easy reading
        System.out.println('\f');
        
        // main class members
        String fourLetterString = "";
        int threeDigitNumber = 0;
        String someSymbol = "";
        
        // Concatenated string of combined data input
        String concatenatedString = "";
        
        // Scanner object to get user input data
        Scanner UserInput = new Scanner(System.in);
        
        // while loop to keep prompting the user to enter the data until it's valid data and the right length
        while(fourLetterString.length() != 4){
            // Ask the user to input a four letter String and save it into the "fourLetterString" variable
            System.out.println("Enter a four letter String: ");
            fourLetterString = UserInput.nextLine();
            
            // Check if the user input is valid by checking the length and comparing to four
            if(fourLetterString.length() != 4){
                System.out.println("Only four letters accepted! Try again.");
            }
        }
        
        
        
        System.out.println("Enter a 3 digit number: ");
        threeDigitNumber = UserInput.nextInt();	
        
        
     // Ask the user to input a Symbol and save it into the "someSymbol" variable
        System.out.println("Enter a Symbol: ");
        
        while(someSymbol.length() != 1) {
        	
        	someSymbol = UserInput.nextLine();
	        if(someSymbol.length() > 1)
	        {
	        	System.out.println("Too many symbols entered try again: ");
	        }
        }
        
        // Line Break
        System.out.println("");
        
        // Print each piece of data entered
        System.out.println("Each piece of data entered: ");
        System.out.println(fourLetterString);
        System.out.println(threeDigitNumber);
        System.out.println(someSymbol);
        
        // concatenate user input data into a unified String
        concatenatedString = fourLetterString + String.valueOf(threeDigitNumber) + someSymbol;
        
        // Line Break
        System.out.println("");
        
        // Print each piece of data entered
        System.out.println("Concatenated version of data: ");
        // Print concatenated version of data
        System.out.println(concatenatedString);

       
    }
}
