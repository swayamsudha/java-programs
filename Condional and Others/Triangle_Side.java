/*WAP TO CHECK A TRIANGLE BY ITS SIDES*/

import java.util.*;
class Triangle_Side
{
	public static void main(String args[])
	{
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The three sides of a triangle-:");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		System.out.println("The three sides of a triangle are: " +a+ "," +b+ "," +c  );
		
		if((a+b > c ) && (a+c > b)  && (b+c > a))
		{
			System.out.println("It is a valid triangle");
			
			if(a == b && a == c && b == c)
				System.out.println("It is a valid Equilateral triangle");
		
			else if (a == b || b == c || c == a)
				System.out.println("It is a Isosceles triangle");
			
			else if(a != b && b != c && a != c)
				System.out.println("It is a Scalene triangle");
		}	
		else
				System.out.println("It is not a valid triangle");
	}
}