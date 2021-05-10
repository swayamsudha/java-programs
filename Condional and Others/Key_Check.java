/*WAP TO CHECK A KEY PRESSED BY AN USER*/

import java.util.Scanner;

class Key_Check
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the key is to be checked -: ");
		char key = sc.next().charAt(0);

		System.out.println("key = " +key);
		
		if(Character.isLetter(key))
			
			System.out.println(key + "is a alphabetical character");
			
		else if(Character.isDigit(key))
			
			System.out.println(key + "is a numerical character");
			
		else if(Character.isWhitespace(key))
			
			System.out.println(key + "is a space character");
			
		/*else if (Character.isCntrl(key))
			
			System.out.println(key +"is a control character");
			
		else if(Chracter.isPrint(key))
			
			System.out.println(key +"is a print character");*/
		else

			System.out.println("No");
	}
}