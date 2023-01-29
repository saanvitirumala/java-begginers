package saanvi.java.assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator!");
		System.out.println("Choose an operation: \n" + " 1 --> +\n 2 --> - \n 3 --> *\n 4 --> /\n 5 --> %\n");

		Scanner input = new Scanner(System.in);
		int operationtype = input.nextInt();

		if (operationtype == 1) {
			System.out.println("Please enter two input values: ");

			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double totalsum = num1 + num2;
			System.out.println("Sum of two numbers: " + totalsum);
		} else if (operationtype == 2) {
			System.out.println("Please enter two input values: ");

			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double totalsum = num1 - num2;
			System.out.println("Subtraction of two numbers: " + totalsum);
		} else if (operationtype == 3) {
			System.out.println("Please enter two input values: ");
			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double product = num1 * num2;
			System.out.println("Multiplication of two numbers: " + product);
		} else if (operationtype == 4) {
			System.out.println("Please enter two input values: ");
			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double quotient = num1 / num2;
			System.out.println("Division of two numbers: " + quotient);
		} else if (operationtype == 5) {
			System.out.println("Please enter two input values: ");
			input = new Scanner(System.in);
			double num1 = input.nextDouble();
			input = new Scanner(System.in);
			double num2 = input.nextDouble();
			double remainder = num1 % num2;
			System.out.println("Quoitent of two numbers: " + remainder);
		} else {
			System.out.println("Invalid selection. Please choose a number from the menu.");

		}

	} // end of main method

}// end of class