import java.util.Scanner;
import java.lang.Math.*;

// Mario Lopez
// Inventory Ordering Tool -This program is intented to help count how many items of certain products are
//required to order. Obtain 

// I've learned how to create a new project in Eclipse, 
//How to load a project from OneDrive, 
//The shortcut sysout - Ctrl + space
//Ctrl + shift + f
//int - integer, double - decimals, String - words
// variable - place holder for something, a location in memory

public class Main {
    public static void inventoryRange(int max, int n) {

        if (n >= 0 && n < max) {
            System.out.println("You need to order the following items: ");
            System.out.println(max - n);
        } else {
            System.out.println("Inventory is good! No need to order");
        }
    }
//vtftftf
    public static void main(String[] args) {
        // Startup
        System.out.println("Welcome to the Smart Calculation Tool!");
        System.out.println("You are entering the Ordering Tool");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shelf count for product1:");
        int max = input.nextInt();
        System.out.println("Enter shelf count for product2:");
        int n = input.nextInt();
        // invoke method
        inventoryRange(max, n);
        // Average per customer
        System.out.println();
        System.out.println("Entering Average per Customer");
        System.out.println("Enter daily customer count");
        double customers = input.nextDouble();
        System.out.println("Enter daily total sales");
        double sales = input.nextDouble();
        double average = (sales / customers);
        double averageRound = Math.round(average * 100.0) / 100.0;
        System.out
                .println("The average sales per customer is $" + averageRound);
        // End of Day Deposit
        System.out.println();
        System.out.println("Entering End of Day Reports");
        System.out.println("Please enter AM morning cash deposit amount");
        double amCash = input.nextDouble();
        System.out.println("Enter PM cash deposit amount ");
        double pmCash = input.nextDouble();
        System.out.println("Enter checks deposit amount");
        double checks = input.nextDouble();
        double EOD = (amCash + pmCash + checks);
        System.out.println("EOD for today is: " + EOD);
        System.out.println("Today's deposit balance is: $" + (EOD - sales));
        System.out.println();
        System.out.println("Thank you for using The Smart Calculation Tool");
        // operators demostration
        System.out.println();
        int product5 = 12;
        int totalboxes = 5;
        System.out.println(
                "Total number of product5 is: " + (product5 * totalboxes));
        System.out.println("The remainer of product5 and total boxes is: "
                + (product5 % totalboxes));
    }

}
