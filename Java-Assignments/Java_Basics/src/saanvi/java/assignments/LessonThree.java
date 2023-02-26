package saanvi.java.assignments;

public class LessonThree {

	public static void main(String[] args) { // main method

		// Logical Operators

		int num1 = 3;
		if (!(num1 > 5)) { // Using NOT

			System.out.println("Yes.");
		}

		if (num1 < 5) { // without NOT
			System.out.println("Yes.");

		}
		
		testTest2(100,true);

	}

	public static void testTest2(int temperature, boolean summer) {  /// testTest2 method

		System.out.println("The parameters are: "+ temperature+" and "+ summer);
	}

}
