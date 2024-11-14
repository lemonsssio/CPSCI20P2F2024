/*

Program: chapter 3 mastery Project pg 73          Last Date of this Revision: 2024/09/19

Purpose: Write a program that prompts the user for the election results, and then displays output similar to:

Author: Denise Phung 
School: CHHS
Course: Computer Programming 20 
 

*/



package Mastery;

import java.util.Scanner;

public class E14Election {
	
	
	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
		
	System.out.println("Election results for New York:");//headers title
	System.out.print("Candiate Awbrey:"); //prompt user for votes Awbrey got
	int NYCawb = userInput.nextInt();  //cast as integers, because voters are whole people
	System.out.print("Candiate Martinez:"); //prompt user for votes Martinez got
	int NYCmart = userInput.nextInt();  //cast as integers, because voters are whole people
	
	
	
	System.out.println("Election results for New Jersey:"); //headers title
	System.out.print("Candiate Awbrey:"); //prompt user for votes Awbrey got
	int NJawb = userInput.nextInt(); //cast as integers, because voters are whole people
	System.out.print("Candiate Martinez:"); //prompt user for votes Martinez got
	int NJmart = userInput.nextInt();  //cast as integers, because voters are whole people
	
	
	
	
	System.out.println("Election results for Connecticut:"); //headers title
	System.out.print("Candiate Awbrey:"); //prompt user for votes Awbrey got
	int Cawb = userInput.nextInt();  //cast as integers, because voters are whole people
	System.out.print("Candiate Martinez:"); //prompt user for votes Martinez got
	int Cmart = userInput.nextInt();  //cast as integers, because voters are whole people
	
	//recasted all users inputs to double in order to perform percentage calculations also added each candiates votes together
	double MartAll = Cmart + NJmart + NYCmart;
	double AwbAll = NYCawb + NJawb + Cawb;
	double together =  MartAll + AwbAll;
	
	
	// displays each vandiates total votes, and percentage won/lost in 2 decimal places
	System.out.println("     ");
	System.out.println("Candiates:");
	System.out.println("Awbrey:");
	System.out.println("  Votes:" + (int)AwbAll); //recasted as int for visual looks, and voters cannot be a double #
	System.out.print("  Percentage: %" );
	System.out.format( "%.2f" , ((AwbAll/together)) *100); //round to 2 decimal places
	
	System.out.println("     ");
	System.out.println("Martinez:");
	System.out.println("  Votes:" + (int)MartAll);  //recasted as int for visual looks, and voters cannot be a double #
	System.out.print("  Percentage: %");
	System.out.format( "%.2f" , (MartAll/together) * 100); //round to 2 decimal places
	System.out.println("");
	System.out.println("Total Votes:" + (int)together);
	
	
}}
/* OUTPUT MESSAGE (screen dump)
Election results for New York:
Candiate Awbrey:656
Candiate Martinez:55
Election results for New Jersey:
Candiate Awbrey:66
Candiate Martinez:556
Election results for Connecticut:
Candiate Awbrey:4455
Candiate Martinez:333
     
Candiates:
Awbrey:
  Votes:5177
  Percentage: %84.58     
Martinez:
  Votes:944
  Percentage: %15.42
Total Votes:6121
 */

