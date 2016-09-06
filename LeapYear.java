import java.io.Console;

public class LeapYear {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What year were you born in?");
    String stringBirthYear = console.readLine();
    Integer birthYear = Integer.parseInt(stringBirthYear);

    System.out.println("You were alive during these leap years:");

    // Initializing the year variable, setting it to the user's birthYear (Integer year = birthYear).
    // Instructing the loop to stop running when year < 2016 is no longer true.
    // Adding 1 to our year variable every time we run through the loop ( year++).

    for (  Integer year = birthYear ; year < 2016 ; year++) {
      if ( year % 4 == 0) {
        System.out.println(year);
      }
    }
  }
}
