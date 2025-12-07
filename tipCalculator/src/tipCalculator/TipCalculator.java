//Jordan Brown, CIS406, Tip Calculator
package tipCalculator;
import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("$###,###,##0.00");
        DecimalFormat percentFormat = new DecimalFormat("0'%'");

        System.out.println("Tip Calculator\n");

        char cont = 'y';

        while (cont == 'y' || cont == 'Y') {

            // Enter meal cost
            System.out.print("Cost of meal: ");
            double mealCost = input.nextDouble();
            System.out.println();

            // Loop tip percentages from 0.15 to 0.25 increasing by 0.05
            for (double tipRate = 0.15; tipRate <= 0.25; tipRate += 0.05) {

                int tipPercent = (int)(tipRate * 100);

                double tipAmount = mealCost * tipRate;
                double totalAmount = mealCost + tipAmount;

                System.out.println(percentFormat.format(tipPercent));
                System.out.println("Tip amount:\t " + moneyFormat.format(tipAmount));
                System.out.println("Total amount:\t " + moneyFormat.format(totalAmount));
                
            }

            // Continue?
            System.out.println();
            System.out.print("Continue? (y/n): ");
            cont = input.next().charAt(0);
            System.out.println();
        }

        System.out.println("Bye!!!");
        input.close();
    }
}
