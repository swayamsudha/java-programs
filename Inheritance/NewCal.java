/*WAP to implement inheritance*/
import java.util.Scanner;
class Calculation
{
	int z;
	void add(int x, int y) 
	{
		z = x+y;
		System.out.println("Additon of the numbers is : " +z);
	}
	void sub(int x,int y)
	{
		z = x-y;
		System.out.println("subtraction of the numbers is : " +z);
	}
}
class NewCal extends Calculation
{
	void mul(int x,int y)
	{
		z = x*y;
		System.out.println("Multiplication of the numbers is : " +z);
	}
	void div(int x,int y)
	{
		z = x/y;
		System.out.println("subtraction of the numbers is : " +z);
	}
		public static void main(String args[])
		{
			int a,b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the values");
			a = sc.nextInt();
			b = sc.nextInt();
			NewCal cal = new NewCal();
			cal.add(a,b);
			cal.sub(a,b);
			cal.mul(a,b);
			cal.div(a,b);
		}
} 
