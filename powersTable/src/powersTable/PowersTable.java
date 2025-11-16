// Jordan Brown, CIS406
// Squares and Cubes Table Program
package powersTable;
import java.util.Scanner;
public class PowersTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Squares and Cubes table\n");
        char continueChoice = 'y';
        while (continueChoice == 'y' || continueChoice == 'Y') {

            // Ask the user for an integer
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println();
            // Create table string
            String table = "";
            // Column headers
            table += "Number\tSquared\tCubed\n";
            table += "======\t=======\t=====\n";

            // Build rows using a loop
            for (int i = 1; i <= number; i++) {
                int square = i * i;
                int cube = i * i * i;

                table += i + "\t" + square + "\t" + cube + "\n";
            }

            // Display table
            System.out.println(table);

            // Ask if user wants to continue
            System.out.print("Continue? (y/n): ");
            continueChoice = input.next().charAt(0);
            System.out.println();

            // Validate response
            while (continueChoice != 'y' && continueChoice != 'Y' &&
                   continueChoice != 'n' && continueChoice != 'N') {

                System.out.println("Invalid response.");
                System.out.print("Continue? (y/n): ");
                continueChoice = input.next().charAt(0);
                System.out.println();
            }
        }

        System.out.println("Bye!!");
        input.close();
    }


}


