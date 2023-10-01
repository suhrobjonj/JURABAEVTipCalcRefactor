public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    private double totalBeforeTip;

    private double calcTip;

    public TipCalculator(int num, int p) {
        numPeople = num;
        tipPercentage = p;
        totalBeforeTip = 0;
        calcTip = tipPercentage / 100.0;
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
        return totalBeforeTip * calcTip;
    }

    public double totalBill() {
        return totalBeforeTip + (totalBeforeTip * calcTip);
    }
    public double perPersonCostBeforeTip() {
        return totalBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return (totalBeforeTip * calcTip) / numPeople;
    }

    public double perPersonTotalCost() {
        return (totalBeforeTip + (totalBeforeTip * calcTip)) / numPeople;
    }
}
