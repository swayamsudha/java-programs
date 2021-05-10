/*WAP to implement hierarchial inheritance in java*/
import java.util.Scanner;
class Base11
{
	int no1,no2;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values");
		no1=sc.nextInt();
		no2=sc.nextInt();
	}
	void show()
	{
		System.out.println("Base class");
	}
}
class Derived22 extends Base11
{
	void show1()
	{	
		System.out.println("Derived22 class");
		System.out.println("The nos are " +no1+ " and " +no2);
	}
}
class Derived11 extends Base11
{
	void show1()
	{	
		System.out.println("Derived 11 class");
		System.out.println("The nos are " +no1+ " and " +no2);
	}
}
class InheritanceHier
{
	public static void main(String args[])
	{	
		Derived11 ob1 = new Derived11();
		ob1.show();
		ob1.input();
		ob1.show1();
		Derived22 ob2 = new Derived22();
		ob2.show();
		ob2.input();
		ob2.show1();
		
	}
}