import  java.util.*;
class Pascal_Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int n=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			for (int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" " +fact(i)/(fact(k)*fact(i-k)));
			}
			System.out.println(" ");
		}
	}
	
	static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
