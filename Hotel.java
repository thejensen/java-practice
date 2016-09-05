import java.io.Console;

public class Hotel {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("In what season are you booking a stay?");
    String season = console.readLine();

    System.out.println("On the weekend, or a weeknight?");
    String dayOfWeek = console.readLine();

    // Here, we've defined two booleans. Notice we're using the primitive type boolean, and not its wrapper class Boolean, because we're not calling any methods upon our booleans.
    boolean summer = season.equals("summer");
    boolean weekend = dayOfWeek.equals("weekend");

    if ( summer && weekend ) {
      System.out.println("Your stay is probably going to be pretty expensive. It's both peak travel season AND the weekend.");
    // We can DRY up our code by using the || operator. || means or.
    } else if ( summer || weekend ) {
    System.out.println("Your stay is probably going to be pretty expensive.");
    } else {
    System.out.println("Your stay may be costly, but it could certainly be worse!");
    }
  }
}
