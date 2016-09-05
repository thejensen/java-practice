import java.io.Console;

public class ShippingCostEstimator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("I will calculate your shipping costs. Enter details about your package below.");
    System.out.println("What is the weight?");
    String packageWeightString = myConsole.readLine();
    Integer packageWeight = Integer.parseInt(packageWeightString);

    System.out.println("What is the distance it will travel?");
    String distanceToTravelString = myConsole.readLine();
    Integer distanceToTravel = Integer.parseInt(distanceToTravelString);

    System.out.println("What is the price modifier?");
    String priceModifierString = myConsole.readLine();
    Integer priceModifier = Integer.parseInt(priceModifierString);

    Integer shippingCost = ( packageWeight / 10 ) + ( distanceToTravel / 5 ) * priceModifier;
    String shippingCostString = shippingCost.toString();

    System.out.println("Your shipping cost is: " + shippingCostString);
  }
}
