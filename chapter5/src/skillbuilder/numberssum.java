package skillbuilder;

import java.util.Scanner;

public class numberssum {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("enter a number:");
	int input = userInput.nextInt();
	
	
	while (input > 0) {
		int ones = input % 10;
		System.out.println(ones);
		int tens = ((input - ones) / 10);
		System.out.println(tens);
		int total = (tens + ones);
		System.out.print(total);
		break ;}

	}

}
