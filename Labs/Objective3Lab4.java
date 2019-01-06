import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String last;
    int age;

    Scanner input = new Scanner(System.in);
    System.out.println("What is your first name?");
    firstName = input.next();

    System.out.println("What is your last name?");
    last = input.next();

    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.println("First Name: "+ firstName+", " + "Last Name: " + last + "," + " Age: " + age);
    /*
What is your last name?
Smith

      Your solution goes here
    */

    input.close();
  }
}
