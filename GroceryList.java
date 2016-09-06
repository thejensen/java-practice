public class GroceryList {
  public static void main(String[] args) {
    String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"  };
    Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4 };

    for ( String groceryItem : myGroceryList ) {
      System.out.println(groceryItem);

// Creating a new Integer total, and setting it to 0. It is important that we do this outside of our loop. If this code existed within our loop, the line Integer total = 0; would actually reset our total to 0 for each iteration of the loop.
// Inside our new loop, we are updating total to equal total + price. price represents one item in the groceryItemPrices as the for loop goes through each item in the array. We determine that we will refer to each individual item in the array as price in the opening line of the loop, when we state: for ( Integer price : groceryItemPrices).

    Integer total = 0;
      for ( Integer price : groceryItemPrices) {
        total += price;
      }
    }
  }
}
