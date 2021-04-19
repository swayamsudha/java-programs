/*WAP TO FIND ROOTS OF A QUADRATIC EQUATION*/

import java.util.Scanner;

class Quad_Eqn
{
	public static void main (String args[])
	{
		int a,b,c;
		double D,r1,r2,roots;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quadratic equation is:(a*x^2)+ (b*x)+ c ");
		System.out.println("Enter the coefficient of the quadratic equation:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		D = Math.sqrt((b*b) - (4*a*c));
		System.out.println("D = " +D);
		
		if(D==0)
		{
			roots = (-b)/(2*a);
			System.out.println("The roots are same:" +roots);
			
		}
		else if(D>0)
		{
			r1=(-b+D)/(2*a);
			r2=(-b-D)/(2*a);

			System.out.println("The roots of aquadratic equation are :"  +r1+ "and" +r2);
		}
		else
		{
			System.out.println("The roots are not real numbers!!!!!");
		}


		
	}
}


