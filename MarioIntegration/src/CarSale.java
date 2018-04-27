
public class CarSale {

  // fields declarations
  private double retailPrice;
  private double taxPercent = 6.0;
  private double dealerFee = 399.0;
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

  public double getDealerFee() {
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
