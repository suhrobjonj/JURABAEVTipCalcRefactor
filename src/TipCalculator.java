public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    private double totalBeforeTip;

    public TipCalculator(int num, int p) {
        numPeople = num;
        tipPercentage = p;
        totalBeforeTip = 0;
    }

    public double getTotalBillBeforeTip() {
        return totalBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBeforeTip += cost;
    }

    public double tipAmount() {
        return totalBeforeTip * tipPercentage;
    }

    public double totalBill() {
        return totalBeforeTip + (totalBeforeTip * tipPercentage);
    }
    public double perPersonCostBeforeTip() {
        return totalBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return (totalBeforeTip * tipPercentage) / numPeople;
    }

    public double perPersonTotalCost() {
        return (totalBeforeTip + (totalBeforeTip * tipPercentage)) / numPeople;
    }
}
