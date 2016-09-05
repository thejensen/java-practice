import java.io.Console;

public class TwoNumbers {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("I will tell you if your number has two numbers in it.");
    Integer myNumber = Integer.parseInt(myConsole.readLine());
    if ( myNumber >= 10 && myNumber <= 100 ) {
      System.out.println("Woohoo, your number has two numbers!");
    } else {
      System.out.println("Nope, your number does not have two numbers.");
    }
  }
}
