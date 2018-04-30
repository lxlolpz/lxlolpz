import java.util.Scanner;

// Mario Lopez
// This program demonstrates different coding in java
// Main objective is to calculate the money amount to finance when
// selling a car. 

// sysout - Ctrl + space
// Ctrl + shift + f

public class Main {

  // Main method
  public static void main(String[] args) {
    // Program Greeting
    System.out.println("Welcome to Mario's program!");
    System.out.println();

    System.out.println("**Car Sale Tool** ");

    // variables for retail price and down payment
    double retail, down;
    Scanner keyboard = new Scanner(System.in);
    CarSale car;
    System.out.println("Enter car's retail price: ");
    retail = keyboard.nextDouble();
    System.out.println("Enter Downpayment");
    down = keyboard.nextDouble();
    car = new CarSale(retail, down);

    System.out.println("Retail price: " + car.getRetailPrice());
    System.out.println("  Dealer fee: " + CarSale.getDealerFee());
    System.out.println("   Sales Tax: " + car.getTaxPercent());
    System.out.println(" Downpayment: " + car.getDownPayment());
    System.out.println("Amount to be Financed: $" + car.getAmountToFinance());
    System.out.println();

    // if-else demonstration
    System.out.println("**Grade Calculator** ");
    System.out.println("Enter Test Score: ");
    double testscore;
    String grade;
    int a = 1;
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
    Object grade1 = "Grade is = ";
    String casted = (String) grade1;
    System.out.println(casted + grade);
    while (testscore >= 70 && a == 1) {
      System.out.println("You hava passed the test");
      a++;
    }
    System.out.println();

    // Array - entering test scores to obtain lowest, average, etc
    int size, sum = 0;
    System.out.println("Enter total number of tests: ");
    size = keyboard.nextInt();
    int[] scores = new int[size];
    System.out.println("Enter test scores: ");
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
    System.out.println(
        "The lowest score is " + min + " at position " + index + " in array.");
    System.out.println("The highest score is " + max + " at position "
        + indexOne + " in array.");
    System.out.println();

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

    // Manipulating Characters Demonstration
    String end = "This is End of program ";
    String endtext = end.substring(8, 22);
    System.out.println(endtext.toUpperCase());
    System.out.println();

  }
}
