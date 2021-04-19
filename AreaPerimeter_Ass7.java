/*
    programe name   :   to find are and perimeter of sure, triangle 
                        and rectrangle where these methods are in 
                        abstarct class Shape
    file name       :   AreaPerimeter.java
    date            :   5/10/2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// abstact class Shape
abstract class Shape
{
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape
{
    float side1, side2;

    Rectangle(float side1, float side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }
    double perimeter()
    {
        return (2 * (side1 + side2));
    }
    double area()
    {
        return (side1 * side2);
    }
}

class Square extends Shape
{
    float side;

    Square(float side)
    {
        this.side = side;
    }
    double perimeter()
    {
        return (4 * side);
    }
    double area()
    {
        return (side * side);
    }
}

class Circle extends Shape
{
    float radious;

    Circle(float radious)
    {
        this.radious = radious;
    }
    double perimeter()
    {
        return (2 * Math.PI * radious);
    }
    double area()
    {
        return (Math.PI * (radious * radious));
    }
}

class AreaPerimeter_Ass7
{
    public static void main(String[] args)throws IOException
    {
        float a, b;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Shape obj;

        // for rectangle
        System.out.println("AREA AND PERIMETER OF RECTANGLE = ");
        System.out.print("side1 = ");
        a = Float.parseFloat(buf.readLine());
        System.out.print("side2 = ");
        b = Float.parseFloat(buf.readLine());

        obj = new Rectangle(a, b);
        System.out.println("Perimeter = " + obj.perimeter());
        System.out.println("Area = " + obj.area());
        

        // for square
        System.out.println("\nAREA AND PERIMETER OF SQUARE = ");
        System.out.print("side = ");
        a = Float.parseFloat(buf.readLine());

        obj = new Square(a);
        System.out.println("Perimeter = " + obj.perimeter());
        System.out.println("Area = " + obj.area());

        // for circle
        System.out.println("\nAREA AND PERIMETER OF CIRCLE = ");
        System.out.print("radious = ");
        a = Float.parseFloat(buf.readLine());

        obj = new Circle(a);
        System.out.println("Perimeter = " + obj.perimeter());
        System.out.println("Area = " + obj.area()); 
    }
}
