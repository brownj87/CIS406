//Jordan Brown CIS 406 Vacation Diary//
package vacationdiary1;
import java.util.Scanner;
public class VacationDiary1 {

	public static void main(String[] args) 
	{
		//Show the diary header
		System.out.println("Vacation Diary\n");
		
		//Enter vacation data
		System.out.print("Enter Date Vacation Started (mm/dd/yyyy): ");
		Scanner input = new Scanner(System.in);
		String startDate = input.nextLine();
		System.out.print("Enter City Visited: ");
		String city = input.nextLine();
		System.out.print("Enter Country Visited: ");
		String country = input.nextLine();
		System.out.print("Enter number of days: ");
		String numberDays = input.nextLine();
		System.out.print("Enter Mode of Travel (car, airplane, ship, train, bus): ");
		String travelMode = input.nextLine();
		
		//Display output
		System.out.println();
		System.out.println("Details of your trip:");
		System.out.println("Date: " + startDate);
		System.out.println("City: " + city);
		System.out.println("Country " + country);
		System.out.println("Number of Days: " + numberDays);
		System.out.println("Traveled By: " + travelMode);
		System.out.println("Bye!!!");
		
		//Close Scanner
		input.close();
			
	}

}
