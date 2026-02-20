import java.util.Scanner;

public class AssignmentOne {
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("Task One To Be Implemented");
    }

    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        System.out.println("Task Two To Be Implemented");
    }

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

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
            if (choice == 2)
                restockItem(itemNames, itemStocks, null, choice);
        }
        scanner.close();
        System.out.println("Exiting System.");
    }
}
