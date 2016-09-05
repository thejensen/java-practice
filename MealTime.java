import java.io.Console;

public class MealTime {
  public static void main(String[] args) {

    // System.out.println("What did you eat for breakfast?");
    // replaces the above code with the question outlined in the custom method defined below.
    askWhatYouAteFor("breakfast");
    // // String yourBreakfast = myConsole.readLine();
    // System.out.println("You had " + yourBreakfast + " for breakfast.");

    askWhatYouAteFor("lunch");
    // String yourLunch = myConsole.readLine();
    // System.out.println("You had " + yourLunch + " for lunch.");

    askWhatYouAteFor("dinner");
    // String yourDinner = myConsole.readLine();
    // System.out.println("You had " + yourDinner + " for dinner.");
  }

  public static void askWhatYouAteFor(String meal) {
    // ADD HERE to DRY code
    Console myConsole = System.console();

    System.out.println("What did you eat for " + meal + "?");
    String yourMeal = myConsole.readLine();
    System.out.println("You had " + yourMeal + " for " + meal + ".");
  }
}
