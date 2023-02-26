package saanvi.java.assignments;

import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Name:");
		Scanner input = new Scanner (System.in);
		String name = input.next();
		
		System.out.println("Enter Age:");
		input = new Scanner (System.in);
		int age= input.nextInt();
		
		System.out.println("Enter Group Size:");
		 input = new Scanner (System.in);
		 int groupSize= input.nextInt();
		 
		 System.out.println("Enter Height:");
		 input = new Scanner (System.in);
		 double height= input.nextDouble();
		 
		 
		 System.out.println("The input variables are: "+name+", "+age+", "+ groupSize+" and "+ height);
		 
		  if(canRide(height, age) && fastPass(age, groupSize) ) {
			
			 System.out.println(name+", you are allowed to ride the roller coaster. You can have a fast pass. Thank You.");
		 } else if(canRide(height, age) || fastPass(age, groupSize) ) {
			
			 System.out.println(name+", you are allowed to ride the roller coaster. You cannot have a fast pass. Thank You.");
		 }
			 
		 
		 

	}
	
	// Method to check canRide for  roller coaster
	public static boolean canRide(double height,int age) {
		
		if(height > 48  && age > 13) {
			return true;
		}else
			return false;
	}

	// Method to check FastPass for roller coaster
	public static boolean fastPass(int age, int groupSize) {
		if(groupSize <= 2 || age < 7) {
			return true;
		}else
			return false;
	}
}
