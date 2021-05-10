/*WAP to implement single inheritance in java*/
import java.util.Scanner;
class Base1
{
	int no1;
	void show()
	{
		System.out.println("Base class");
	}
}
class Base2 extends Base1
{
	int no2;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values");
		no1=sc.nextInt();
		no2=sc.nextInt();
	}
}
class Derived1 extends Base2
{
	void show1()
	{	
		System.out.println("Derived class");
		System.out.println("The nos are " +no1+ " and " +no2);
	}
}
class InheritanceMulti
{
	public static void main(String args[])
	{	
		Derived ob = new Derived();
		ob.show();
		ob.input();
		ob.show1();
	}
}