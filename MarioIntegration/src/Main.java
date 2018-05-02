import java.time.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;



// Mario Lopez
// This program demonstrates different concepts in java learned throughout
// the semester.
// Main objective is to calculate the money amount to finance when
// selling a car. 

// sysout - Ctrl + space
// Ctrl + shift + f

/**Main class of the program.
 * @author Lalo
 *
 */
public class Main {

  static final String salutation = "Hello ";

  // Main method
  /**Main method. 
   * @param args
   **/
  public static void main(String[] args) {
    // Greeting using Predicate Lambda
    GreetingService greetService1 = message -> System.out
        .println(salutation + message);
    greetService1.sayMessage("User!");
    
    // Program Greeting
    System.out.println("Welcome to Mario's Integration Program!");
    
    // Method call for Current date and time
    dateTime();

    System.out.println();

    System.out.println("CAR SALE TOOL");

    // variables for retail price and down payment
    double retail; 
    double down;
    Scanner keyboard = new Scanner(System.in);
    CarSale car;

    boolean gottenGoodInput = false;
    while (gottenGoodInput == false) {
      System.out.println("Enter car's retail price: ");
      // Try Block
      try {
        retail = keyboard.nextDouble();
        System.out.println("Enter Downpayment");
        down = keyboard.nextDouble();
        car = new CarSale(retail, down);

        System.out.println("Retail price: " + car.getRetailPrice());
        System.out.println("  Dealer fee: " + CarSale.getDealerFee());
        System.out.println("   Sales Tax: " + car.getTaxPercent());
        System.out.println(" Downpayment: " + car.getDownPayment());
        System.out
            .println("Amount to be Financed: $" + car.getAmountToFinance());
        System.out.println();
        gottenGoodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Please enter integers only, try again!");
        keyboard.nextLine();
      }
    }

    // if-else demonstration
    double testscore;
    String grade;
    int a = 1;
    System.out.println("GRADE CALCULATOR");
    boolean goodInput = false;
    while (goodInput == false) {
      System.out.println("Enter Test Score: ");
      // Try Block
      try {
        testscore = keyboard.nextDouble();

        if (testscore >= 90) {
          grade = "A";
        } else if (testscore >= 80) {
          grade = "B";
        } else if (testscore >= 70) {
          grade = "C";
        } else if (testscore >= 60) {
          grade = "D";
        } else {
          grade = "F";
        }

        // Casting demonstration
        Object grade1 = "Test's grade is = ";
        String casted = (String) grade1;
        System.out.println(casted + grade);
        while (testscore >= 70 && a == 1) {
          System.out.println("Congratulations! You hava passed the test");
          a++;
        }
        System.out.println();
        goodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Please enter integers only, try again!");
        keyboard.nextLine();
      }
    }

    // Array - entering test scores to obtain lowest, average, etc
    int size; 
    int sum = 0;
    System.out.println("ARRAY OF TESTS SCORES");
    System.out.println("Enter total number of tests to calculate ");
    size = keyboard.nextInt();
    int[] scores = new int[size];

    boolean intInput = false;
    while (intInput == false) {
      System.out.println("Enter test scores: ");

      try {
        for (int i = 0; i < size; i++) {
          scores[i] = keyboard.nextInt();
          sum = sum + scores[i];
        }

        // To Get Array Sum
        System.out.println("The sum of scores is " + sum);

        // Getting max and min with its array index
        int max = 0;
        int index = 0;
        int indexOne = 0;
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
          if (max < scores[i]) {
            max = scores[i];
            indexOne = i;
          }
          if (min > scores[i]) {
            min = scores[i];
            index = i;
          }
        }
        System.out.println("The lowest score is " + min + " at position "
            + index + " in array.");
        System.out.println("The highest score is " + max + " at position "
            + indexOne + " in array.");
        System.out.println();
        intInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("Please enter integers only, try again!");
        keyboard.nextLine();
      }
    }

    keyboard.close();

    // String Builder - reverse, delete, insert
    System.out.println("String Builder");
    StringBuilder str = new StringBuilder("Mario Eduardo Lopez Murillo");
    System.out.println("Full name = " + str);
    // delete characters
    System.out.println("First name = " + str.delete(6, 27));
    // insert character
    str.insert(6, 'E');
    System.out.println("First & Middle name = " + str.toString());
    // reverse characters
    System.out.println("Now in reverse = " + str.reverse());
    System.out.println();

    // Inheritance method calls
    Audi a4 = new A6();
    Audi a6 = new A4();
    a4.model();
    a4.engine();
    a6.model();
    a6.engine();
    System.out.println();

    // HashMap
    System.out.println("Values from HashMap:");
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(5, "Five");
    map.put(8, "Eight");
    map.put(6, "Six");
    map.put(4, "Four");
    map.put(2, "Two");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      int key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + ": " + value);
    }
    System.out.println();

    // Queue Demonstration
    System.out.println("Queue Demonstration ");
    Queue<String> q1 = new ArrayBlockingQueue<String>(3);
    q1.add("Steve");
    q1.add("Edward");
    q1.add("Laura");
    System.out.println("The first person in queue is: " + q1.element());
    System.out.println();
    
    System.out.println("Thank you for using this program");

    // Manipulating Characters Demonstration
    String end = "This is End of program ";
    String endtext = end.substring(8, 22);
    System.out.println(endtext.toUpperCase());
    System.out.println();

  }

  
  /** Method for Predicate Lambda.
   * @author Lalo
   *
   */
  interface GreetingService {
    void sayMessage(String message);
  }

  // Method to obtain current date and time
  public static void dateTime() {
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Current Date and Time: " + currentDateTime);
  }
}
