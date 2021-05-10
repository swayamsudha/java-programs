/*WAP TO PRINT UPPERCASE LOEWRCASE AND NUMERIC CHARACTER*/

import java.util.Scanner;

class Up_Low_Num_Alt 
{
	public static void main(String args[])
	{
		char a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character or number:");
		a = sc.next().charAt(0); 
		System.out.println("a = " +a);
		
		if (a >= 65 && a <=90)
			System.out.println("It is a Uppercase character..." +a);
		else if(a >= 97 && a <= 122)
			System.out.println("It is a Lowercase character..." +a);
		else if(a>=48 && a <= 57)
			System.out.println("It is a Numeric character..." +a);
		else if ((a >= 65 && a <=90) || (a >= 97 && a <= 122) || (a>=48 && a <= 57) )
			System.out.println("It is an AlphaNumeric character..." +a);
		else
			System.out.println("Not a valid input!!!!!");
	}
}