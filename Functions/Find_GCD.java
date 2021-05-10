/*WAP to find gcd of two numbers using find gcd() in buferreader input*/
import java.io.*;
class Find_GCD
{
	int findGCD(int temp1,int temp2)
	{
		while(temp1 != temp2)
		{
			if(temp1>temp2)
				temp1-=temp2;
			else
				temp2-=temp1;
		}
		return temp1;
	}
	

	public static void main(String args[]) throws IOException
	{
		Find_GCD fg = new Find_GCD() ; 
		int n1,n2,gcd;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two numbers whose gcd is to be calculated:");
		n1 = Integer.parseInt(br.readLine());
		n2 = Integer.parseInt(br.readLine());
		gcd=fg.findGCD(n1,n2);
		System.out.println("GCD of " +n1+ " and " +n2+ " is = " +gcd);
	}
}