
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
  public CarSale(double retail, double down) {
    retailPrice = retail;
    downPayment = down;
    totaltax = retailPrice * (taxPercent / 100.0);
    totaltax = Math.round(totaltax * 100);
    totaltax = totaltax / 100;
    totalCost = retailPrice + totaltax + dealerFee;
    amountToFinance = totalCost - downPayment;
  }

  // Method Accessors
  public double getRetailPrice() {
    return retailPrice;
  }

  public static double getDealerFee() {
    return dealerFee;
  }

  public double getTaxPercent() {
    return totaltax;
  }

  public double getDownPayment() {
    return downPayment;
  }

  public double getAmountToFinance() {
    return amountToFinance;
  }
}
