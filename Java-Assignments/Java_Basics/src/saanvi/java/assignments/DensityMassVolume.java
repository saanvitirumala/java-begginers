package saanvi.java.assignments;

import java.util.Scanner;

public class DensityMassVolume {

	public static void main(String[] args) {
		System.out.println("Enter mass: ");
		Scanner input = new Scanner (System.in);
		double mass = input.nextDouble();
		
		System.out.println("Enter volume: ");
		Scanner input1 = new Scanner (System.in);
		double volume = input1.nextDouble();
		
		double density = mass / volume;
		System.out.println("The density is: "+ density);
	
	}
}
