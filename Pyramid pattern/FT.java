import java.util.Scanner;
class FT
{
	 static void fibo(int N)
	{
		int f1=0,f2=1;
		
		for(int i  = 1;i<=N;i++)
		{
			System.out.print(f1+ " ");
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:\n");
		n=sc.nextInt();
		System.out.println("The fibbonaci pattern is:\n");
		for(int i =1;i<=n;i++)
		{
			fibo(i);
		}
		
	}
}