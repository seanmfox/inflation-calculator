import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class InflationCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current cost of the item: ");

        int currentCost = scanner.nextInt();

        System.out.println();

        System.out.println("Enter the expected inflation rate per year.");
        System.out.print("(Enter the value without using the percent sign): ");

        double inflationRate = scanner.nextDouble() / 100;

        System.out.println();

        System.out.print("Enter the number of years of inflation: ");

        int years = scanner.nextInt();

        System.out.println();

        double total = currentCost;

        for(int i = 0; i < years; i++)
            total *= (inflationRate + 1);

        NumberFormat money = NumberFormat.getCurrencyInstance();

        DecimalFormat percent = new DecimalFormat("0.00%");

        System.out.println("At " + percent.format(inflationRate) + " inflation per year, the cost in " + years + " year(s) will be " + money.format(total));
    }
}
