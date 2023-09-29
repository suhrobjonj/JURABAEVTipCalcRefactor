import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tip Calculator!!");
        System.out.print("Enter amount of people: ");
        int numPeople = scan.nextInt();
        System.out.print("Enter tip percentage: ");
        int percentTip = scan.nextInt();
        TipCalculator calc = new TipCalculator(numPeople, percentTip);

        String items = "\n";
        String itemName;
        int itemCount;

        System.out.print("Enter price of item: ");
        double price = scan.nextDouble();

        while (price != -1) {
            scan.nextLine();
            System.out.print("Enter item name: ");
            itemName = scan.nextLine();
            System.out.print("Total number ordered: ");
            itemCount = scan.nextInt();
            items += (itemName + " x " + itemCount + "\n");
            calc.addMeal(price * itemCount);

            System.out.print("Enter price of item (-1 to continue): ");
            price = scan.nextDouble();
        }

        double totalCostBeforeTip = calc.getTotalBillBeforeTip();
        System.out.println("---------------------------------------------------");
        System.out.println("Total price: $" + String.format("%.2f",totalCostBeforeTip));
        System.out.println("Tip percentage: %" + calc.getTipPercentage());
        System.out.println("Total tip amount: $" + String.format("%.2f",calc.tipAmount()));
        System.out.println("Total bill after tip: $" + String.format("%.2f",calc.totalBill()));
        System.out.println("Per person cost before tip: $" + String.format("%.2f",calc.perPersonCostBeforeTip()));
        System.out.println("Per person tip cost: $" + String.format("%.2f",calc.perPersonTipAmount()));
        System.out.println("Total cost per person: $" + String.format("%.2f",calc.perPersonTotalCost()));
        System.out.println("---------------------------------------------------");
        System.out.println("Items ordered: " + items);

    }
}