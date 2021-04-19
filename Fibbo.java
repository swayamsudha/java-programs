import java.util.Scanner;
class Fibbo
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many no to be calculated");
		n = sc.nextInt();
		for(int i =0;i<=n-1; i++)
		{
			System.out.println("Fibbo = " +fibbono(i) );
			
		}
	}
	
	public static int fibbono(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibbono(n-1)+fibbono(n-2);
	}
	
}
