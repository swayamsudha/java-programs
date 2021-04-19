/*WAP to convert Farenheit to Celcius*/

import java.util.Scanner;

class Farenheit_Celcius
{
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the temp to be converted:");
		float farenheit = sc.nextInt();
		System.out.println("Farenheit = " +farenheit);
		
		float celcius = ((farenheit-32)*5)/9;
		System.out.println("celcius = " +celcius);
		
		
	}
}