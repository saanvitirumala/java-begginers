package saanvi.java.assignments;

/**
 * https://www.metric-conversions.org/temperature/fahrenheit-to-celsius.htm
 * 
 * Implemented the fahrenheit and celcius using  link above
 */

import java.util.Scanner;

public class FToC {

	public static void main(String[] args) {
		
		//User entered input for Fahrenheit
		System.out.println("Enter degree of Fahrenheit here: ");
		Scanner input = new Scanner (System.in);
		
		double fahrenheit = input.nextDouble();
		double celcius = (fahrenheit - 32) / 1.8000;
		System.out.println("Celcius value is: "+ celcius);
		
		if(celcius == -273.15) {
			System.out.println("The celcius tempurature is Absolute Zero.");
		}else if(celcius == -40) {
			System.out.println("The celcius tempurature is Parity.");
		}else if(celcius == -17.78) {
			System.out.println("The celcius tempurature is Zero.");
		}else if(celcius == 0) {
			System.out.println("The celcius tempurature is freezing point");
		}else if(celcius == 37) {
			System.out.println("The celcius tempurature is body tempurature.");
		}else if(celcius == 100){
			System.out.println("The celcius tempurature is boiling point.");
		}
		

	}

}
