//Jordan Brown CIS406 Student Registration Lab//
package studentRegistration;
import java.util.Scanner;
public class StudentRegistration {

	public static void main(String[] args) 
	{
		
		// Show the application's welcome
		System.out.println("Student Registration Form\n");
		
		// Input Data
		System.out.print("Enter first name: ");
		Scanner input = new Scanner(System.in);
		String firstName = input.next();
		System.out.print("Enter last name: ");
		String lastName = input.next();
		System.out.print("Enter year of birth: ");
		String birthYear = input.next();
		
		// Output Variables
		String fullName = firstName + " " + lastName;
		String password = firstName + "*" + birthYear;
		
		// Display Output
		System.out.println();
		System.out.println("Welcome " + fullName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + password);
		
		// Close Scanner
		input.close();
	}

}
