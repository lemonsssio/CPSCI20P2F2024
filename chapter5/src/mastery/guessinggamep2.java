	/*


Program: guessing game chapter 5         Last Date of this Revision: 2024/10/03

Purpose: The GuessingGame application created in Chapter 5 Exercise 8 would be more fun if users could make
as many guesses as necessary to guess the secret number. Modify the GuessingGame application as
follows.

Author: Denise Phung
School: CHHS
Course: Computer Programming 20
 

*/

		package mastery;
		import java.util.Random;
		import java.util.Scanner;

		public class guessinggamep2 {

			public static void main(String[] args) {
			Scanner userInput = new Scanner(System.in);	
			
			//random computer generated number
				Random rand = new Random();
				int randnum = rand.nextInt(1,20);
				
			//prompts user for input message			
				System.out.println("Enter a number between 1-20:");
				int user = userInput.nextInt();
				
			//creates a do statement comparing user input with generated number, also if it is between 1-20
				do { 
					if (0 >= user || 20 <= user) 
					System.out.println("the number you entered is not between 1-20");
					
					
					else if (user != randnum) 
						if (user > randnum)
							System.out.println("your number is to big, try again");
						else if (user < randnum)
							System.out.println("your number is to small, try again");
					user = userInput.nextInt();
					
			//prints out correct and ends loop
				} while (user != randnum ); 
					if (user == randnum)
						System.out.print("correct!");
						

				}}
					

	/* OUTPUT MESSAGE
Enter a number between 1-20:
4
wrong guess sorry, try again!
5
wrong guess sorry, try again!
6
wrong guess sorry, try again!
7
wrong guess sorry, try again!
8
correct! */


