/*WAP to implement single inheritance in java*/
import java.util.Scanner;
class Base
{
	int no1;
	void show()
	{
		System.out.println("Base class");
	}
}
class Derived extends Base
{
	int no2;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values");
		no1=sc.nextInt();
		no2=sc.nextInt();
	}
	void show1()
	{	
		System.out.println("Derived class");
		System.out.println("The nos are " +no1+ " and " +no2);
	}
}
class InheritanceSingle
{
	public static void main(String args[])
	{	
		Derived ob = new Derived();
		ob.show();
		ob.input();
		ob.show1();
	}
}