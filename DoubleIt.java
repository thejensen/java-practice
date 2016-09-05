// import console package
import java.io.Console;

public class DoubleIt {
  public static void main(String[] args) {
  // create a new instance of the console object
  Console myConsole = System.console();

  System.out.println("Give me a number and I will double it for you!");
  // and call the readline method on that object
  String stringNumber = myConsole.readLine();
  // must convert string input to an integer duh
  Integer yourNumber = Integer.parseInt(stringNumber);
  //  using tshe wrapper class Integer because we're calling a method on our number
  Integer yourDoubledNumber = yourNumber * 2;
  // new variable to convert the doubled number BACK to a string to print the return value into the console
  String stringDoubledNumber = Integer.toString(yourDoubledNumber);
  // output stringDoubledNumber
  System.out.println("I doubled your number for you: " + stringDoubledNumber);
  }
}
