import java.io.Console;

public class Encrypt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Write a phrase and I will encrypt it for you.");
    String yourPhrase = myConsole.readLine();
    String encryptPhrase = yourPhrase.replaceAll("a", "watermelon");
    System.out.println(encryptPhrase);
  }
}
