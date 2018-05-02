
/**
 * Class used to obtain the amount that will be finance when purchasing a car
 * @author Lalo
 *
 */
public class CarSale {

  // static and non static fields declarations
  // static means that only one instance of a static field exists
  // even when creating infinite instances of a class, it will be shared by all
  // instances.
  private double retailPrice;
  private static double taxPercent = 6.0;
  private static double dealerFee = 399.0;
  private double totalCost;
  private double downPayment;
  private double amountToFinance;
  private double totaltax;

  // constructor
  /**
   * retail price of car.
   * @param
   * down payment.
   * @param 
   **/
  public CarSale(double retail, double down) {
    retailPrice = retail;
    downPayment = down;
    totaltax = retailPrice * (taxPercent / 100.0);
    totaltax = Math.round(totaltax * 100);
    totaltax = totaltax / 100;
    totalCost = retailPrice + totaltax + dealerFee;
    amountToFinance = Math.round(totalCost - downPayment);
  }

  // Method Accessors
  /**
   * will return retail price of a car.
   * @return  
   */
  public double getRetailPrice() {
    return retailPrice;
  }

  /**
   * will return dealer fee.
   * @return 
   */
  public static double getDealerFee() {
    return dealerFee;
  }

  /**Returns total tax paid for car purchase. 
   * @return
   */
  public double getTaxPercent() {
    return totaltax;
  }

  /**Returns down payment made.
   * @return
   */
  public double getDownPayment() {
    return downPayment;
  }

  /**returns total amount to finance.
   * @return
   */
  public double getAmountToFinance() {
    return amountToFinance;
  }
}
