import java.util.Scanner;
class Prime_RangePrime	
{	
	int i;
	public int primeset(int start,int end)
	{
		for( i =start; i<=end; i++)
		{
			int count = 0;
			for(int j = 1; j<=i; j++)
			{
				if(i%j == 0 )
					count++;
			}
			if(count == 2)
				System.out.println(i);
		}
		return i;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting point:");
		int s=sc.nextInt();
		System.out.println("Enter the ending point:");
		int e = sc.nextInt();
		System.out.println("The prime numbers between " +s+ " and " +e+ " = " );
		Prime_Range ob = new Prime_Range();
		int res = ob.primeset(s,e);
		
		
	}
}