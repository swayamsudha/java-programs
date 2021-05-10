import java.util.Scanner;
class Permutation
{
	int factorial(int n)
	{
		int res =1;
		while(n!=0)
		{
			res*=n;
			n--;
		}
		return res;
	}
	public static void main(String args[])
	{
		Permutation ob = new Permutation();
		int fact1,fact2,n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		if(n == 0)
		{
			System.out.println("Zero is not be valid !!");
			//System.exit(1);
		}
		temp = n;
		fact1 =ob.factorial(n);
		
		while(n!= 0)
		{
			fact2 = ob.factorial(n);
			n--;
			System.out.println(temp+ "P" +n+ "=" +fact1/fact2);
		}
	}
}