/*------------------------------------------------------------------------- 
// AUTHOR: Jake Conrad
// FILENAME: Savings
// SPECIFICATION: Program takes 3 input values and outputs the average 
// FOR: CSE 110- Compound Interest
// TIME SPENT: 1310 - 1330 ~20 Minutes
//-----------------------------------------------------------------------*/

import java.util.Scanner;
import java.lang.Math;

public class Savings {

	public static void main(String[] args) {
		
		// Declares initial input variables
		double annualInterest, initialSavings;
		int saveMonths;
		
		System.out.println("Simple interest calculation - Jake Conrad\n\n");
		
		// takes input from user and assigns values. Closes input scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the intial savings amount: ");
		initialSavings = input.nextDouble();
		
		System.out.print("Please enter the annual interest rate: ");
		annualInterest = input.nextDouble();
		
		System.out.print("Please enter the time in months you will save: ");
		saveMonths = input.nextInt();
		
		input.close();
		
		// converts annual interest rate into monthly interest rate 
		double monthlyInterest = (annualInterest / 100) / 12;
		// performs interest calculation
		double finalSavings = initialSavings * Math.pow((1 + monthlyInterest), saveMonths);
		
		// Prints results of calculation
		System.out.printf("Initial ammount of $%.2f, saved for %d  months at %.2f%% will have a final value of $%.2f\n", 
				initialSavings, saveMonths, annualInterest, finalSavings);

	}

}
