import java.util.Scanner;

class String_Vowel_Cons
{
	
	public static void main(String args[]) 
	{
		int count_vow = 0;
		int count_cons = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) =='U')
			{
				count_vow ++;
			}
			else if(s.charAt(i) == ' ')
			{
				continue;
			}				
			else
			{
				count_cons ++;
			}
		}
		System.out.println("In string " + s + "\nNumber of vowels  is " +count_vow+ " \nNumber of consonant is " +count_cons );
	}
}