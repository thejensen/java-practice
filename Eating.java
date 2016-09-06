import java.io.Console;

public class Eating {
  public static void main(String[] args) {
    Console console = System.console();

    String[] foods = { "pears", "steak", "salad", "bread", "butter", "tacos", "apples", "buffalo wings", "carrots", "ice cream" };
    for ( Integer index = 0 ; index < 4 ; index++ ) {
      System.out.println("I am eating " + foods[index] + "." );
    }
    System.out.println("I'm full.");
  }
}
