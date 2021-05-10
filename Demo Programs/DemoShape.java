/* WAP to implement different shapes*/
import java.util.Scanner;
abstract class Shape
{
	int radius,side1,side2;
	double res;
	abstract void input();
	abstract void area();
	abstract void showResult();
}
class Square extends Shape
{
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:");
		side1 = sc.nextInt();
		System.out.println("The value of the side of the Square is " +side1);
	}
	void area()
	{
		res = side1*side1;
		//System.out.println("The area of the Square is " +res);
	}
	void showResult()
	{
		System.out.println("The area of the Square is " +res);
	}
}
class Rectangle extends Shape
{
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the rectangle:");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		System.out.println("The sides of the rectangle is " +side1+ "and" +side2);
	}
	void area()
	{
		res = side1* side2;
	}
	void showResult()
	{
		System.out.println("The area of the Rectangle is " +res);
	}
}
class Circle extends Shape
{
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		radius = sc.nextInt();
		System.out.println("The value of the radius of the circle is " +radius);
	}
	void area()
	{
		res = 3.14*radius*radius;
		//System.out.println("The area of the Square is " +res);
	}
	void showResult()
	{
		System.out.println("The area of the Circle is " +res);
	}
}
class DemoShape
{
	public static void main(String args[])
	{
		Shape ob;//instance of base class
		
		ob = new Square();
		ob.input();
		ob.area();
		ob.showResult();
		
		
		ob = new Rectangle();
		ob.input();
		ob.area();
		ob.showResult();
		
		
		ob = new Circle();
		ob.input();
		ob.area();
		ob.showResult();
	}
}