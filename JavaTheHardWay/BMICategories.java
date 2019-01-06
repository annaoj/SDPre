import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi, m, feet, kg, inch, pounds;

		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inch = keyboard.nextDouble();

		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();

    m = ((feet*12)+inch) / (1/0.0254);
    kg = pounds/2.2046;
		bmi = kg / (m*m);

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
