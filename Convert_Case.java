/*WAP TO CONVERT UPPERCASE LOWERCASE AND ALTERNATE CASE*/

import java.util.Scanner;

class Convert_Case
{
	public static void main(String args[])
	{
		char c1,c2,c3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three alphabet to be converted:");
		c1 = sc.next().charAt(0);
		c2 = sc.next().charAt(0);
		c3 = sc.next().charAt(0);
		System.out.println("Before Conversion " +c1+ "," +c2+ "," +c3 );
		
		c1 =(int) c1 &~ 32;
		c2 = (int)c2 | 32;
		c3 = (int)c3 ^ 32;
		System.out.println("After Conversion " +c1+ "," +c2+ "," +c3 );
		
	}
}