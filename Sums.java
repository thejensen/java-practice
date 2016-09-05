import java.io.Console;

public class Sums {
  public static void main(String[] args) {
  Console add1 = System.console();
  Console add2 = System.console();
  Console subtract1 = System.console();
  Console subtract2 = System.console();
  Console multiply1 = System.console();
  Console multiply2 = System.console();
  Console divide1 = System.console();
  Console divide2 = System.console();

// ADD
  System.out.println("I will add two numbers for you. What's your first number?");
  String add1String = add1.readLine();
  Integer add1Int = Integer.parseInt(add1String);
  System.out.println("What's the number you want to add?");
  String add2String = add2.readLine();
  Integer add2Int = Integer.parseInt(add2String);
  Integer sumInteger = add1Int + add2Int;
  String sumString = sumInteger.toString();
  System.out.println("Your sum is: " + sumString);

// Subtract
  System.out.println("I will subtract two numbers. What's the first number?");
  String subtract1String = subtract1.readLine();
  Integer subtract1Int = Integer.parseInt(subtract1String);
  System.out.println("What's second number to subtract?");
  String subtract2String = subtract2.readLine();
  Integer subtract2Int = Integer.parseInt(subtract2String);
  Integer differenceInteger = subtract1Int - subtract2Int;
  String differenceString = differenceInteger.toString();
  System.out.println("Your difference is: " + differenceString);

// Multiplication
  System.out.println("I will multiply two numbers. What's the first number?");
  String multiply1String = multiply1.readLine();
  Integer multiply1Int = Integer.parseInt(multiply1String);
  System.out.println("What's the second number to multiply?");
  String multiply2String = multiply2.readLine();
  Integer multiply2Int = Integer.parseInt(multiply2String);
  Integer productInt = multiply1Int * multiply2Int;
  String productString = productInt.toString();
  System.out.println("Your product is: " + productString);

// Division
  System.out.println("I will divide two numbers for you. What's the first number?");
  String divide1String = divide1.readLine();
  Integer divide1Int = Integer.parseInt(divide1String);
  System.out.println("What's the second number to divide?");
  String divide2String = divide2.readLine();
  Integer divide2Int = Integer.parseInt(divide2String);
  Integer quotientInt = divide1Int / divide2Int;
  String quotientString = quotientInt.toString();
  System.out.println("Your quotient is: " + quotientString);


  }
}
