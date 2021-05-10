import java.util.Scanner;

class String_Vowel_Cons_String
{
	
	public static void main(String args[]) 
	{
		int count_vow = 0;
		int count_cons = 0;
		char v_arr [] = new char [50];
		char c_arr [] = new char [50];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) =='U')
			{	
				v_arr[i] = s.charAt(i);
			}
			else
			{
				c_arr[i] = s.charAt(i);
			}
		
		}
		String v = new String(v_arr);
		String c = new String(c_arr);
		
		
		System.out.print("Vowels : " +v);
		System.out.print("Consonants : " +c);
	}
}