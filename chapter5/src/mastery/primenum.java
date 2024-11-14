/*


Program: prime number chapter 5         Last Date of this Revision: 2024/10/01

Purpose: A prime number is an integer greater than 1 that is evenly divisible by only 1 and
itself. For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not. Create
a PrimeNumber application that prompts the user for a number and then displays a
message indicating whether the number is prime or not. Hint: The % operator can be
used to determine if one number is evenly divisible by another

Author: Denise Phung
School: CHHS
Course: Computer Programming 20
 

*/



package mastery;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		//user inputs/message
		System.out.println("This program will determine if a number is prime or composite");
		System.out.println("Enter a number: ");
		int input = userInput.nextInt();
		
		//so that integer is greater than 1
		int div = 1;
		
		
		//no conditional statement needed
		do { 
			div += 1;
			
			
		}while (input % div != 0  );
		
		//for the prime/composite output message for user
			if (input == div)
			System.out.println("true");
			else 
			System.out.println("false");

	    	}}

				   		 
	
/* 
This program will determine if a number is prime or composite
Enter a number: 
97
Prime number

This program will determine if a number is prime or composite
Enter a number: 
81
Composite number
	*/
