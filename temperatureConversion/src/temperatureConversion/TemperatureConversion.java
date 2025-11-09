//Jordan Brown, CIS406, Temperature Conversion Lab//
package temperatureConversion;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Converter\n");
		
		//Fahrenheit to Celsius
		System.out.print("Enter degress in Fahrenheit: ");
		double Fahrenheit = input.nextDouble();
		double Celsius = (Fahrenheit - 32) * 5 / 9;
		System.out.println("Degrees in Celsius: " + (int)Celsius + "\n");
		
		//Celsius to Fahrenheit
		System.out.print("Enter degrees in Celsius: ");
		Celsius = input.nextDouble();
		Fahrenheit = (Celsius * 9 / 5) + 32;
		System.out.println("Degrees in Fahrenheit: " + (int)Fahrenheit + "\n");
		
		System.out.println("Bye!!");
		
		input.close();
		}
}
