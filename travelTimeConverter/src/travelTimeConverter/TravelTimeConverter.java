//Jordan Brown, CIS406, Travel Time Lab//
package travelTimeConverter;
import java.util.Scanner;
public class TravelTimeConverter {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator\n");
		//Input miles and miles per hour
		System.out.print("Enter Miles: ");
		int miles = input.nextInt();
		System.out.print("Enter miles per hour: ");
		int mph = input.nextInt();
		
		//Calculate total time
		int totalMinutes = (miles * 60) / mph;
		int hours = totalMinutes / 60;
		int minutes = totalMinutes % 60;
		
		//Display Output
		System.out.println("");
		System.out.println("Estimated travel time\n");
		System.out.println("---------------------");
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes + "\n");
		System.out.println("Bye!!");
		
		input.close();
	}

}
