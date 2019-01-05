public class CreatingVariables{
  public static void main( String[] args){
    int x, y, age, quantity;
    double seconds, e, checking, price ;
    String firstName, lastName, title, product, place ;

    x = 10;
    y = 400;
    age = 39;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    price = 12.99;
    quantity = 3;

    product = "jackets";
    place = "store";
    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "There are " + quantity + " " + product + " left in the " + place + " for $"+price+"!");
  }
}
