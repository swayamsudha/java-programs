/* WAP to implement different shapes in the form of [INTERFACE]*/
import java.util.Scanner;
interface Shape1
{
	//int radius,side1,side2;
	//double res;
	public abstract void input(); // all methods to be declared by public abstract
	public abstract void area();
	public abstract void showResult();
}
class Square1 implements Shape1
{
	int side1,res;
	 public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:");
		side1 = sc.nextInt();
		System.out.println("The value of the side of the Square is " +side1);
	}
	 public void area()
	{
		res = side1*side1;
		//System.out.println("The area of the Square is " +res);
	}
	 public void showResult()
	{
		System.out.println("The area of the Square is " +res);
	}
}
class Rectangle1 implements Shape1
{
	int side1,side2,res;
	 public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the rectangle:");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		System.out.println("The sides of the rectangle is " +side1+ " and " +side2);
	}
	public void area()
	{
		res = side1* side2;
	}
	public void showResult()
	{
		System.out.println("The area of the Rectangle is " +res);
	}
}
class Circle1 implements Shape1
{
	int radius;
	double res;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		radius = sc.nextInt();
		System.out.println("The value of the radius of the circle is " +radius);
	}
	public void area()
	{
		res = 3.14*radius*radius;
		//System.out.println("The area of the Square is " +res);
	}
	public void showResult()
	{
		System.out.println("The area of the Circle is " +res);
	}
}
class DemoShape1
{
	public static void main(String args[])
	{
		Shape1 ob;//instance of base class
		
		ob = new Square1();
		ob.input();
		ob.area();
		ob.showResult();
		
		
		ob = new Rectangle1();
		ob.input();
		ob.area();
		ob.showResult();
		
		
		ob = new Circle1();
		ob.input();
		ob.area();
		ob.showResult();
	}
}