import java.io.Console;
import java.util.Arrays;

public class PooToGoldArray {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Name a thing you don't like, ok?");
    String poo1 = myConsole.readLine();
    System.out.println("Name another thing you don't like.");
    String poo2 = myConsole.readLine();
    System.out.println("Name yet another thing you don't like.");
    String poo3 = myConsole.readLine();

    String[] poo = new String[] { poo1, poo2, poo3 };
    System.out.println("You don't like: " + Arrays.toString(poo));

    System.out.println("Now name a thing you do like.");
    String gold1 = myConsole.readLine();
    poo[0] = gold1;
    System.out.println("You like the first one in the list but not the others: " + Arrays.toString(poo));

    System.out.println("Now name another thing you do like.");
    String gold2 = myConsole.readLine();
    poo[1] = gold2;
    System.out.println("You like the first two in the list but not the last one: " + Arrays.toString(poo));

    System.out.println("Now name another thing you do like.");
    String gold3 = myConsole.readLine();
    poo[2] = gold3;
    System.out.println("You like the everything in the list: " + Arrays.toString(poo));
  }
}
