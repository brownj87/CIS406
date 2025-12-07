//Jordan Brown, CIS406, Interest Rate Calculator Part 1
package interestRateCalculatorPart1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class InterestRateCalculatorPart1 {
	// Method to calculate interest
    public static double calculateInterest(double loanAmount, double rateDecimal) {
        return loanAmount * rateDecimal;
    }
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        DecimalFormat moneyFormat = new DecimalFormat("$###,###,###.00");
	        DecimalFormat percentFormat = new DecimalFormat("0.#'%'");

	        System.out.println("Welcome to the Interest Calculator\n");

	        char cont = 'y';

	        while (cont == 'y' || cont == 'Y') {

	            // Enter loan amount
	            System.out.print("Enter loan amount:\t ");
	            double loanAmount = input.nextDouble();

	            // Enter interest rate as whole number
	            System.out.print("Enter interest rate:\t ");
	            double interestRateWhole = input.nextDouble();

	            // Convert whole number to decimal
	            double rateDecimal = interestRateWhole / 100.0;

	            // Calculate interest
	            double interest = calculateInterest(loanAmount, rateDecimal);

	            // Display results
	            System.out.println();
	            System.out.println("Loan amount:\t\t " + moneyFormat.format(loanAmount));
	            System.out.println("Interest rate:\t\t " + percentFormat.format(interestRateWhole));
	            System.out.println("Interest:\t\t " + moneyFormat.format(interest));
	            System.out.println();

	            // Continue?
	            System.out.print("Continue? (y/n): ");
	            cont = input.next().charAt(0);
	            System.out.println();
	        }

	        System.out.println("Bye!!!");
	        input.close();
	    }
	}
