import java.util.Scanner;

public class Objective5Lab1 {
	public static void main( String[] args ) {
    int month = 6;

    switch(month) {
      case  1:
            System.out.println("January");
            break;
      case  2:
           System.out.println( "February");
      case  3:
           System.out.println( "March");
      case  4:
           System.out.println( "April");
           break;
      case  6:
           System.out.println( "June");
           break;
      default:
      System.out.println("That is not a valid month");
      break;
    }
  }
}
