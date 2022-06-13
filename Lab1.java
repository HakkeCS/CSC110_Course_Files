/*------------------------------------------------------------------------- 
// AUTHOR: Jake Conrad
// FILENAME: Lab1
// SPECIFICATION: Program takes 3 input values and outputs the average 
// FOR: CSE 110- Lab #1 
// TIME SPENT: 1240 - 1300 ~20 minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab1 {
	
	public static void main(String[] args) {
		
		// Declares variables for each test and a constant for the number of tests in the program
		int testScore1, testScore2, testScore3;
		final double TEST_AMMOUNT = 3;
		
		// Create scanner variable and collect the three test scores from user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first test score: ");
		testScore1 = input.nextInt();
		
		System.out.print("Enter the second test score: ");
		testScore2 = input.nextInt();
		
		System.out.print("Enter the third test score: ");
		testScore3 = input.nextInt();
		
		// closes input
		input.close();

		// creates double variable that calculates the average of the three test scores
		double testAverage = (testScore1 + testScore2 + testScore3) / TEST_AMMOUNT;
		
		// Prints the results of the average calculation
		System.out.printf("The average test score is: %.2f\n", testAverage);
		
	}

}
