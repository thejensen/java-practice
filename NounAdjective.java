import java.io.Console;

public class NounAdjective {
  public static void main(String[] args) {
    Console nounInput = System.console();
    Console adjectiveInput = System.console();

    System.out.println("Give me a noun.");
    String nounString = nounInput.readLine();
    System.out.println("Give me an adjective.");
    String adjectiveString = adjectiveInput.readLine();
    System.out.println("Welcome to the " + adjectiveString + " " + nounString + ".");
  }
}
