package saanvi.java.assignments;

public class LessonTwo {

	public static void main(String[] args) {
		
		
		//Type-casting
		double sample = 5.6;
		int quotient = (int)sample/3;
		System.out.println(quotient);
		
		//Increment Operator
		int sample2 = 6;
		sample2++;
		System.out.println(sample2);
				
		/**sample2--;
		System.out.println(sample2);
		**/
		//Decrement Operator
		int sample3 = 5;
		sample3--;
		System.out.println(sample3);

		//Assignment Operator using +
		int sample4 = 4;
		sample4 += 3;
		System.out.println(sample4);
		
		
		//Assignment Operator using -
		int sample5 = 6;
		sample5 -= 3.1;
		System.out.println(sample5);
		
		//Assignment Operator using *
		int sample6 = 12;
		sample6  *=4;
		System.out.println(sample6);
		
		//Assignment Operator using /
		int sample7 = 18;
		sample7 /= 3;
		System.out.println(sample7);
		
		//Assignment Operator using %
		double sample8 = 12.3;
		sample8 %= 3;
		System.out.println(sample8);
		
		//If and Else Statements
		double sample9 = 9.5;
		if(sample9 == 5) {
			System.out.println("Yes, this value is equivilant");
		}else {
			System.out.println("No, this value is not equivilant");
		}
		
		double sample10 = 3.4;
		if(sample10 > 2) {
			System.out.println("Greater than");
		}else {
			System.out.println("Less than");
		}
		
		
		

	}

}
