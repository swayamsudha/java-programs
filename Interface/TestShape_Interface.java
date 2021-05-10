/*WAP to demonstrate shape using interface
	oct 9 2020
*/
import java.util.*;
import java.lang.Math;

interface Shape
{
  public void area ();
  public void perimeter ();
}

class Circle implements Shape
{
  double radius;

  public Circle (double r)
  {
    radius = r;
  }

  public void area ()
  {
    System.out.println ("Area of the circle is " +
      Math.PI * (Math.pow (radius, 2)));
  }
  public void perimeter ()
  {
    System.out.println ("Perimeter of the circle is " + 2 * Math.PI * radius);
  }
}

class Square implements Shape
{
  double side;

  public Square (double s)
  {
    side = s;
  }
  public void area ()
  {
    System.out.println ("Area of the Square is " + Math.pow (side, 2));
  }
  public void perimeter ()
  {
    System.out.println ("Perimeter of the Square is " + 4 * side);
  }
}

class Rectangle implements Shape
{
  double length, breadth;

  public Rectangle (double a, double b)
  {
    length = a;
    breadth = b;
  }
  public void area ()
  {
    System.out.println ("Area of the Rectangle is " + length * breadth);
  }
  public void perimeter ()
  {
    System.out.println ("Perimeter of the Rectangle is " +
      2 * (length + breadth));
  }
}

class TestShape_Interface
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the radius of the circle");
    double radius = sc.nextDouble ();
    Shape s;
      s = new Circle (radius);
      s.area ();
      s.perimeter ();

      System.out.println ("Eneter the side of the square:");
    double side = sc.nextDouble ();
      s = new Square (side);
      s.area ();
      s.perimeter ();

      System.out.println ("Enter the length of the rectangle:");
    double len = sc.nextDouble ();
      System.out.println ("Enter the breadth of the rectangle:");
    double brd = sc.nextDouble ();
      s = new Rectangle (len, brd);
      s.area ();
      s.perimeter ();
  }
}