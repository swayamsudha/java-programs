import java.util.Scanner;
import java.util.Arrays;

class String_Anagram
{
	public static boolean isAnagram(String str1,String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		else
		{
			char []str1_Array = str1.toCharArray();
			char []str2_Array = str2.toCharArray();
			
			Arrays.sort(str1_Array);
			Arrays.sort(str2_Array);
			
			return Arrays.equals(str1_Array,str2_Array);
		}
	}
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a String:");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a String:");
		String s2 = sc.nextLine();
		
		s1= s1.replaceAll("\\s" , "").toLowerCase();
		s2= s2.replaceAll("\\s" , "").toLowerCase();
		
		if (isAnagram(s1,s2))
		{
			System.out.println(s1 + " and " +s2+ " are two Anagram string.");
		}
		else
		{	
			System.out.println(s1 + " and " +s2+ " are not two Anagram string.");
		}
	}
}