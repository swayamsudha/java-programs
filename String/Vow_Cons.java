/*To find vowel or consonant*/

import java.util.*;
class Vow_Cons
{
	public static void main(String args[])
	{
		char alph;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		alph = sc.next().charAt(0);
		//c = sc.next().charAt(0);
		if((alph >= 65 && alph <= 90) || (alph >= 97 && alph <= 122))
		{
		switch(alph)
			{
				case 'A':
				case 'a':
					System.out.println("It is a vowel....");
					break;
				
				case 'E':
				case 'e':
					System.out.println("It is a vowel....");
					break;
				
				case 'I':
				case 'i':
					System.out.println("It is a vowel...");
					break;
				
				case 'O':
				case 'o':
					System.out.println("It is a Vowel...");
					break;
				
				case 'U':
				case 'u':
					System.out.println("It is a voewl....");
					break;
				
				default:
					System.out.println("It is not a vowel!!!");
				
			}
		
		}
		else
			System.out.println("it is not an alphabet!!!!");
			
	}	
}