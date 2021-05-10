/*WAP to test STRONG no or not using methods()*/

import java.util.Scanner;
class Find_Strong
{
	int dg,fact=1,fact_sum = 0,i=1;
	int findstrong(int n)
	{
		while(n != 0)
		{
			dg = n % 10;
			for(;dg>=1;dg--)
			{
				fact *= dg;
			}
			fact_sum+=fact;
			n = n / 10;
			fact = 1;
			
			
		}
		return fact_sum;
	}
	public static void main(String args[])
	{
		Find_Strong fs = new Find_Strong();
		Scanner sc = new Scanner(System.in);
		int num,res;
		System.out.println("Enter the number:");
		num = sc.nextInt();
		res = fs.findstrong(num);
		if(num==res)
			System.out.println(+num+ " is a STRONG number..");
		else
			System.out.println(+num+ " is not a STRONG number..");
	}
}