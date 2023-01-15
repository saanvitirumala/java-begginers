package saanvi.java.assignments;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name?");
		Scanner input = new Scanner (System.in);
		String name = input.nextLine();
		
		System.out.println("Age?");
		input = new Scanner (System.in);
		int age= input.nextInt();
		
		System.out.println("Biography?");
		input = new Scanner (System.in);
		String biography = input.nextLine();
		
		System.out.println("Color?");
		input = new Scanner (System.in);
		String color = input.nextLine();
		
		System.out.println("Are you a girl?");
		input = new Scanner (System.in);
		boolean gender = input.nextBoolean();
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(biography);
		System.out.println(color);
		System.out.println(gender);
		
		// end
		
		
	
		
		
		

	}

}
