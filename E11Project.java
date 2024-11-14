/*

Program: chapter 3 mastery Project pg 73          Last Date of this Revision: 2024/09/17

Purpose: Create a Project application to help analyze the time taken for a Java project. The application should
prompt you for the time spent designing, coding, debugging, and testing, and then displays a table
showing the percentage of time taken for each part. The application output should look similar to:

Author: Denise Phung 
School: CHHS
Course: Computer Programming 20 
 

*/

package Mastery;

import java.util.Scanner;

public class E11Project {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the number of time you spent on each task!"); 
		System.out.print("Designing: "); //user input
		Double design = userInput.nextDouble(); //saves user input as double #
		System.out.print("Coding: "); //user input
		Double code = userInput.nextDouble(); //saves user input as double #
		System.out.print("Debugging: "); //user input
		Double debug = userInput.nextDouble(); //saves user input as double #
		System.out.print("Testing: ");//user input
		Double test = userInput.nextDouble(); //saves user input as double #
		
		
		Double together = design + test + code + debug ; // cast all four together
		
		//performs division then times by 100. This is why we cast the user input as double so that it keeps the decimal precentage
		debug = (debug / together) *100; 
		code =  (code / together) * 100 ;
		design =  (design / together) * 100 ;
		test =  (test / together) * 100 ;
		
		//output message
		System.out.println("");
		System.out.println("Task: % Time");
		System.out.print(("Designing: %"));
		System.out.format( "%.2f" , design); // cast to 2 decimal places
		System.out.println("");
		System.out.print(("Coding: %"));
		System.out.format( "%.2f" , code); // cast to 2 decimal places
		System.out.println("");
		System.out.print(("Debugging: %"));
		System.out.format( "%.2f" , debug); // cast to 2 decimal places
		System.out.println("");
		System.out.print(("Testing: %"));
		System.out.format( "%.2f" , test); // cast to 2 decimal places
		System.out.println("");

}}



/* OUTPUT MESSAGE (screen dump)
Enter the number of time you spent on each task!
Designing: 546
Coding: 454
Debugging: 345
Testing: 456

Task: % Time
Designing: %30.32
Coding: %25.21
Debugging: %19.16
Testing: %25.32 */

