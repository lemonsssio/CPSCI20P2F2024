	/*


Program: group assignment        Last Date of this Revision: 2024/10/07

Purpose:  Create a GroupAssignment application that prompts the user for his or her name and then displays a
group assignment. The group assignment depends on the first letter of the student’s last name. Last
names beginning with A through I are assigned to Group 1, J through S are assigned to Group 2, T
through Z are assigned to Group 3.

Author: Denise Phung
School: CHHS
Course: Computer Programming 20
 

*/





package mastery;

import java.util.Scanner;


public class groupassignment {

	
	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);

		//user input
		System.out.println("Enter your first name:");
		String First = userinput.nextLine();
		System.out.println("Enter your last name:");
		String last = userinput.nextLine();
		
		
		//lower cases the firse/last name
		last = last.toLowerCase();
		First = First.toLowerCase();
		
		
		//for statement for groups category
		for( int i = 0; i <  last.length(); ++i) {
			int position = last.charAt(i) - 'a' + 1;
			if ( 1 <=  position && position  <= 9 ) {
				System.out.print(First + " " + last + " is assigned to group one"); 
				break;}
			else if ( 9 < position && position <= 18) {
				System.out.print(First + " " + last + " is assigned to group two");
				break;}
			else {
				System.out.print(First + " " + last + " is assigned to group three"); 
				break;}
			
	}}}	

/* OUTPUT MESSAGE
 Enter your first name:
Denise
Enter your last name:
Phung
Denise Phung is assigned to group two
  
 
 * */

