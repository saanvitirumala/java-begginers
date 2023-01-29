package saanvi.java.assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator!");
		System.out.println("Choose an operation: \n" + " 1 --> +\n 2 --> - \n 3 --> *\n 4 --> /\n 5 --> %\n");
// Taking user values into variable
		Scanner input = new Scanner(System.in);
		int operationtype = input.nextInt();

		if (operationtype == 1) {
			System.out.println("Please enter two input values: ");

			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double totalsum = num1 + num2; // adding user's values
			System.out.println("Sum of two numbers: " + totalsum); //printing user's values
		} else if (operationtype == 2) {
			System.out.println("Please enter two input values: ");

			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double totalsum = num1 - num2; //subtracting user's values
			System.out.println("Subtraction of two numbers: " + totalsum); //printing user's values
		} else if (operationtype == 3) {
			System.out.println("Please enter two input values: ");
			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double product = num1 * num2; //multiplying user's values
			System.out.println("Multiplication of two numbers: " + product); //printing user's values
		} else if (operationtype == 4) {
			System.out.println("Please enter two input values: ");
			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double quotient = num1 / num2; //dividing user's values
			System.out.println("Division of two numbers: " + quotient); //printing user's values
		} else if (operationtype == 5) {
			System.out.println("Please enter two input values: ");
			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double remainder = num1 % num2; //giving a remainder of user's values
			System.out.println("Quoitent of two numbers: " + remainder); //printing user's values
		} else {
			System.out.println("Invalid selection. Please choose a number from the menu.");

		}

	} // end of main method

}// end of class