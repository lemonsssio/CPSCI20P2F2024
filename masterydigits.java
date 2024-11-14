/*

Program: chapter 3 mastery Project pg 73          Last Date of this Revision: 2024/09/19

Purpose: Modify the Digits application created in a review earlier in this chapter to show the hundreds-place
digit of a three digit number. The application output should look similar to:

Author: Denise Phung 
School: CHHS
Course: Computer Programming 20 
 

*/
package Mastery;


import java.util.Scanner;

public class masterydigits {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print ("Please enter your three digit number: "); 
		int user = userInput.nextInt(); // prompt user for a three digit number
		int hund = user /100; // divides users number by 100 to get the hundreds place
		System.out.println("your hundreds place is " + Math.abs(hund )); // output hundreds
		int tens = ((hund * 100 ) - user) / 10; // takes the hundreds place and minuses from initial user input then divide by 10 for tens place
		System.out.println("your tens place is: " + Math.abs(tens)); // outputs the tens place abs value
		System.out.println("your ones place is:" + (Math.abs(((hund * 100) + (Math.abs(tens) * 10)) - user))); //minus hundreds and tens place from user to get ones place

	
}}
/* OUTPUT MESSAGE (screen dump)
 Please enter your three digit number: 674
your hundreds place is 6
your tens place is: 7
your ones place is:4
 */ 
