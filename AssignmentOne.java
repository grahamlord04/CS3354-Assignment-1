import java.util.Scanner;

/**
 * Class seeks to build a grocery simulation that is represented
 * through three parallel arrays. main utilizes two functions,
 * printInventory and restockItem, to give the user the ability
 * to view and edit the supermarket's stock.
 */
public class AssignmentOne {
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
        System.out.println("Task Two To Be Implemented");
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
