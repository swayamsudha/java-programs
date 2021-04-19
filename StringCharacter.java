/*	
	WAP to count number of characters in a string
	OCT 14 2020
*/
import java.util.Scanner;

class StringCharacter
{
	
	public static void main(String args[]) 
	{
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) != ' ')
			{
				count ++;
			}
		}
		System.out.println("Number of characters in the string " + s + " is " +count);
	}
}