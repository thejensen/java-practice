import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Give me a whole number greater than 1, and I will tell you if it is an even or odd number, ok?");
    Integer yourNumber = Integer.parseInt(console.readLine());

    if ( yourNumber % 2 == 0 ) {
      System.out.println("Your number is even.");
    } else {
      System.out.println("Your number is odd.");
    }
  }
}
