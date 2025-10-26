//Jordan Brown, CIS406, Course Project Part 1//
package orderEntryPhase1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class OrderEntryPhase1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00"); // For formatting decimals
		// Prompt user for input

		System.out.print("Enter item number: ");
		String itemNumber = input.nextLine();
		System.out.print("Enter item description: ");
		String itemDescription = input.nextLine();
		System.out.print("Enter item price: $");
		double itemPrice = input.nextDouble();
		System.out.print("Enter quantity ordered: ");
		int quantityOrdered = input.nextInt();
		System.out.print("Enter total tax amount: $");
		double taxAmount = input.nextDouble();
		System.out.print("Enter total discount amount: $");
		double discountAmount = input.nextDouble();
		System.out.print("Enter net amount: $");
		double netAmount = input.nextDouble();


		// Display the information with formatting
		System.out.println("\nItem Number\tItem Description\t Price\t\tQuantity\t Tax\t\tDiscount\tNet Amount");
		System.out.println("  " + itemNumber + "\t"
		+ "     " + itemDescription + "\t\t"
		+ " " + df.format(itemPrice) + "\t\t"
		+ "   " + quantityOrdered + "\t\t"
		+ df.format(taxAmount) + "\t\t"
		+ " " + df.format(discountAmount) + "\t\t"
		+ "  " + df.format(netAmount));

		input.close();

	}

}
