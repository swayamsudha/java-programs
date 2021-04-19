import java.util.Scanner;

abstract class Shape
{
	abstract double area();
	abstract double perimeter();
}
class Rectangle extends Shape
{
	double a,b;
	Rectangle(double a,double b)
	{
		this.a = a;
		this.b = b;
	}
	double area()
	{
		return (a*b);
	}
	double perimeter()
	{
		return (2*(a+b));
	}
}
class Square extends Shape
{
	double a;
	Square(double a)
	{
		this.a = a;
	}
	
	double area()
	{
		return a*a;
	}
	double perimeter()
	{
		return 4*a;
	}
}
class Circle extends Shape
{
	double r;
	Circle(double r)
	{
		this.r = r;
	}
	
	double area()
	{
		return 3.14*r*r;
	}
	double perimeter()
	{
		return 2*3.14*r;
	}
}
class Test_Shape
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Shape s;
		
		System.out.println("\n===============RECTANGLE=================");
		System.out.println("Enter the lenght of the Rectangle:");
		double len=sc.nextDouble();
		System.out.println("Enter the breadth of the Rectangle:");
		double bdt=sc.nextDouble();
		s=new Rectangle(len,bdt);
		System.out.println("Area of Rectangle is " +s.area()+ "\nPerimeter of Rectangle is " +s.perimeter());
		
		System.out.println("\n===============SQUARE==================");
		System.out.println("Enter the side of the square:");
		double side=sc.nextDouble();
		s=new Square(side);
		System.out.println("\nArea of Square is " +s.area()+ "\nPerimeter of Square is " +s.perimeter());
		
		System.out.println("\n================CIRCLE=================");
		System.out.println("Enter the radius of the Rectangle:");
		double radius=sc.nextDouble();
		s=new Circle(radius);
		System.out.println("\nArea of Circle is " +s.area()+ "\nPerimeter of Circle is " +s.perimeter());
		
	}
}