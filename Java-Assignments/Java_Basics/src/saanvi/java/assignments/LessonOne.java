package saanvi.java.assignments;

import java.util.Scanner;

/*
 * Program Author; Saanvi Tirumala
 * Java Lesson 1
 * 1: Variables and Declaration Types
 * 2: Comments
 * 3: input and out variables
 * 
 */

public class LessonOne {

	public static void main(String[] args) {

		
		// addition of two numbers
		
			
		int num1= 23;
		int num2 = 2;
		int value = num1 + num2;
		System.out.println("Sum of numbers:"+value);
		
		//Variable Declaration Types
		
		int x = 10;
		float y = (float) 2.4;
		double z = 9.4344443;
		String name = "Saanvi Tirumala";
		char single = 'S';
		boolean amISleepy = true;
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(name);
		System.out.println(single);
		System.out.println(amISleepy);
		
		
		//Inputs and Outputs
		System.out.println("My name is Saanvi"+"\n"+"My age is 14"+"\t"+"I am  from Clifton Park, NY.");
		
		Scanner input = new Scanner (System.in);
			
		System.out.println("Enter integer value: ");
		int inputval= input.nextInt();
		System.out.println("You entered integer value: "+inputval);
		
		

	}

}
