import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, feet, kg, bmi, inch, pounds;

		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inch = keyboard.nextDouble();

		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

    m = ((feet*12)+inch) / (1/0.0254);
    kg = pounds/2.2046;
		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}
