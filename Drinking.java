import java.io.Console;

public class Drinking {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What is your age?");
    Integer age = Integer.parseInt(myConsole.readLine());
    if ( age < 18 ) {
      System.out.println("You cannot drink in Spain, lo siento!");
    } else {
      System.out.println("Salud, you can drink in Spain!");
    }
  }
}
