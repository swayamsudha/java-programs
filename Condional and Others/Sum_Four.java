/*WAP to find sum of a four digit number*/

import java.util.Scanner;

class Sum_Four
{
	public static void main(String args[])
	{
		int num , sum = 0, dg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  four-digit number whose sum is to be calculated-:");
		num = sc.nextInt();
		
		while(num > 0)
		{
			dg = num % 10;
			sum = sum + dg;
			num = num / 10;
		}
		System.out.println("The sum of the digits of the number is = " +sum);
			
	}
}
