import java.util.Scanner;

/**
 * Class seeks to build a grocery simulation that is represented
 * through three parallel arrays. main utilizes two functions,
 * printInventory and restockItem, to give the user the ability
 * to view and edit the supermarket's stock.
 */
public class AssignmentOne {
/**
 * This Block of code searches for a grocery item by name and increases its stock quantity.
 * 
 * This method iterates through the names array to find a match
 * with the specified target item.
 * If the item is found, the given amount is added to the
 * corresponding index in the stocks array.
 * 
 * If the item does not exist in the inventory after checking
 * all elements, a message "Item not found." is printed.
 *
 * @param names  an array containing the names of grocery items
 * @param stocks an array containing the stock quantities
 * @param target the name of the item to restock
 * @param amount the quantity to add to the item's current stock
 */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        /**
        * Prints all non-empty grocery items with their price and stock.
        *
        * @param names  array of item names
        * @param prices array of item prices
        * @param stocks array of item stock quantities
        */
        System.out.println("\nInventory");
        System.out.println("---------------------------");

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {

                System.out.println("Item: " + names[i]
                        + " | Price: $" + prices[i]
                        + " | Stock: " + stocks[i]);

            } else {
                // Empty slot — do nothing
            }
        }
    }

    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

    for (int i = 0; i < names.length; i++) {

        if (names[i] != null && names[i].equalsIgnoreCase(target)) {

            stocks[i] += amount;
            System.out.println("Restocked " + names[i] +
                               ". New stock: " + stocks[i]);
            return;
        }
    }

    System.out.println("Item not found.");
}

    /**
     * Main, displays menu for user to interact with.
     * Also stores parallel arrays that represent the grocery store's
     * items, prices, and stock.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String target;
        int amount = 0;

        while (choice != 3) {
            System.out.println("\nGrocery Managment Menu");
            System.out.println("---------------------------");
            System.out.println("1) View Inventory");
            System.out.println("2) Restock and Search");
            System.out.println("3) Exit System");
            System.out.print("Please Enter Your Choice: ");
            choice = scanner.nextInt();
            if (choice == 1)
                printInventory(itemNames, itemPrices, itemStocks);
            if (choice == 2) {
                System.out.print("Enter Item To Restock: ");
                scanner.nextLine();
                target = scanner.nextLine();
                System.out.print("Enter Amount To Restock: ");
                amount = scanner.nextInt();
                restockItem(itemNames, itemStocks, target, amount);
            }
        }
        scanner.close();
        System.out.println("Exiting System.");
    }
}
