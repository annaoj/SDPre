import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, city;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );

    System.out.print("What is your favorite city?");
    city = keyboard.next();
    System.out.println("Really? I also love " + city+"!");
	}
}
/*
1.No, Scanner converts it to double.The java.util.Scanner.nextDouble() method scans the next token of the input as a double. This method will throw exception if the next token cannot be translated into a valid double value.
2.No, it converts number into string
3.Programm blew up when I entered string when it was expecting int.Compiler doesnt take string as a int or double, so it threw exception
*/
