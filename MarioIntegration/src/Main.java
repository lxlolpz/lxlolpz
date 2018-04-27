import java.util.Scanner;

// Mario Lopez
//This program demonstrates different coding in java

//sysout - Ctrl + space
//Ctrl + shift + f

public class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to Mario's program!");
    System.out.println();
    System.out.println("**Entering Car Sale Tool** ");
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
    System.out.println("  Dealer fee: " + car.getDealerFee());
    System.out.println("   Sales Tax: " + car.getTaxPercent());
    System.out.println(" Downpayment: " + car.getDownPayment());
    System.out.println("Amount to be Financed: " + car.getAmountToFinance());
    System.out.println();

    // if-else example
    System.out.println("**Entering Grade Calculator** ");
    System.out.println("Enter Test Score: ");
    double testscore;
    String grade;
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
    // Casting
    Object grade1 = "Grade is = ";
    String casted = (String) grade1;
    System.out.println(casted + grade);
    System.out.println();

    // Manipulating Characters in Strings
    String end = "This is the End of program ";
    String endtext = end.substring(12, 31);
    System.out.println(endtext.toUpperCase());

    keyboard.close();

  }
}
