/*WAP to use arithmetic operator using readline()*/

//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.io.*;   //IOException;

class Arithmetic_Readline
{
	public static void main(String args[]) throws IOException
	{
		int x,y;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter the numbers::");
		
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		
		System.out.println("The arithmetic operations are:-");
		
		System.out.println("The addition result is: " +(x+y));
		System.out.println("The subtraction result is: " +(x-y));
		System.out.println("The multiplication result is: " +(x*y));
		System.out.println("The division result is: " +(x/y));
		System.out.println("The modulo division result is:"+(x%y));
		
	}
}